# Workshop GraphQL - Student

## Présentation

Ce projet est un atelier pratique autour de GraphQL, conçu pour illustrer la création et la gestion d'une API GraphQL pour la gestion des étudiants. Il permet de manipuler des données d'étudiants (ajout, modification, suppression, consultation) via des requêtes GraphQL.

## Structure du projet

- **src/**  
  Contient le code source principal de l’application.
  - **models/**  
    Définit les modèles de données utilisés, notamment le modèle `Student`.
  - **resolvers/**  
    Contient la logique des résolveurs GraphQL pour traiter les requêtes et mutations.
  - **schema/**  
    Définit le schéma GraphQL (types, requêtes, mutations).
  - **data/**  
    Fichiers de données ou gestion de la source de données (ex : liste d’étudiants en mémoire).
  - **index.js**  
    Point d’entrée de l’application, configure le serveur GraphQL.

- **README.md**  
  Ce fichier, qui explique la structure et le fonctionnement du projet.

## Fonctionnalités principales

- **Consultation de la liste des étudiants**
- **Recherche d’un étudiant par identifiant**
- **Ajout d’un nouvel étudiant**
- **Modification des informations d’un étudiant**
- **Suppression d’un étudiant**

## Utilisation

Après avoir lancé le serveur, vous pouvez interagir avec l’API GraphQL via un client GraphQL (ex : Apollo Studio, GraphQL Playground) pour exécuter des requêtes et mutations sur les étudiants.

---

Ce projet est destiné à l’apprentissage de GraphQL et à la compréhension de la structure d’une API GraphQL simple.
