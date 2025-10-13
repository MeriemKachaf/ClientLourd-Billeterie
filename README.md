#  Projet Client Lourd - Billetterie

## Description
Ce projet a été réalisé dans le cadre du TP de **client lourd** pour le BTS SIO SLAM.  
L’objectif est de modéliser, créer et alimenter une base de données de billetterie d’événements, puis de générer automatiquement des données avec Faker.

## Structure du projet
- `billeterie.puml` → Diagramme UML de la base de données  
- `billeterie.sql` → Script SQL de création de la base  
- `generate_data.py` → Script Python utilisant Faker pour générer les données  
- `data.sql` → Fichier SQL contenant les données générées  

## Technologies utilisées
- PlantUML (modélisation)
- MySQL (base de données)
- Python + Faker (génération de données)
- Git / GitHub (versionnement)

## Génération des données

Le fichier `generate_data.py` utilise la librairie **Faker** pour créer automatiquement :
- 50 clients
- 10 événements
- 100 billets

Les données sont enregistrées dans le fichier `data.sql` et peuvent être importées dans la base de données via MySQL Workbench.


## Auteur
**Meriem Kachaf** – BTS SIO SLAM  
Professeur : Rémi Durand  
Année : 2025                    






