# MagasinDemo
MagasinDemo est développé avec SpringBoot, Spring Data JPA, Spring Data REST et H2 Memory,
L'application offre une Api REST pour un magasin

# REST API
• Afficher un catalogue de produits: http://localhost:8080/api/categories

• Afficher le détail d’un produit: http://localhost:8080/api/products/1

• Créer un nouveau panier (POST): http://localhost:8080/api/cart

• Ajouter un produit au panier (POST): http://localhost:8080/api/cart/1/product/1

• Enlever un produit du panier (DELETE): http://localhost:8080/api/cart/2

• Afficher le contenu du panier: http://localhost:8080/api/carts/1

# Connexion et déconnexion de l'utilisateur avec spring security
pour tester la connexion avec un compte utilisateur, il suffit de cliquer sur lien "Connexion" dans la page d'accueil:

nom utilisateur: **user**

mot de passe: **password**

et pour se déconnecter, il suffit de cliquer sur le bouton "Déconnexion" dans l'autre page


# Comment installer et exécuter
Vous pouvez rouler l'application avec la commande Maven. Aussi vous pouvez construire un JAR exécutable.
Aller à la racine de dossier de l'application et taper:

`./mvnw spring-boot:run`

ou bien vous construisez le fichier JAR avec:

`./mvnw clean package`

Aprés vous exécutez le fichier JAR:

`java -jar target/demo-0.0.1-SNAPSHOT.jar`
