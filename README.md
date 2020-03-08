# DemoFormation

0- Installation

a- TomcatServer 9.0 | Utilisation de Java v.8.x - 

b- Créer une base mysql à l'aide de wamp qui se nomera demoformation et importer le fichier gestionetudiant.sql 
permettant d'avoir des données exemples et de connection.

0bis- Récupération du war

Au niveau de votre disque C, ouvirir une console cmd et ecrire:
`mkdir c:\GTMDemoFormation`

`cd c:\GTMDemoFormation`

`mvn scm:checkout  -DconnectionUrl=scm:git:https://github.com/BenKapoor/DemoFormation`

Aller dans `target\checkout\DemoFormation`

Exécuter la commande :
`mvn install`

Aller dans le dossier target et récupérer le war génréré.

1- Deplacer le fichier DemoFormation.war dans le dossier `webapps` de Tomcat

2- Executer startup.bat situé dans le dossier `bin` de tomcat 

3- Dans l'url du navigateur internet, entrer la commande suivante : http://localhost:8080/GestionEtudiant/

Fonctionnalités présentes :
- Ajouter un thème à la formation

Technologies :
- servlet
- HTML
- JSP
- Bootstrap
- JPA
