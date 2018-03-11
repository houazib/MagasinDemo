package com.magasin.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.magasin.demo.domain.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
