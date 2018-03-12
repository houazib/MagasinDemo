package com.magasin.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.antMatchers("/index").permitAll()
				.antMatchers("/user/**").hasRole("USER")			
				.and()
			.formLogin()
				.loginPage("/login");	
	}
	
	@Bean
	public UserDetailsService userDetailsService(){
	    InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
	    manager.createUser(User.withDefaultPasswordEncoder().username("user").password("password").roles("USER").build());
	    return manager;
	}
	
	@Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/api/**");
        web.ignoring().antMatchers("/h2/**");
    }

}
