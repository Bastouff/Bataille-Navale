# Bataille Navale

Ceci est une implémentation simple en Java de la version console du jeu classique "Bataille Navale". Le programme permet à un utilisateur de placer un bateau sur une grille 10x10, de spécifier son orientation, puis de tenter de "tirer" sur une position choisie pour déterminer s'il a touché ou raté le bateau.

## Fonctionnalités

- **Jeu basé sur une grille :** La grille est une matrice 10x10 où les bateaux peuvent être placés et les tirs effectués.
- **Placement personnalisé des bateaux :** Les utilisateurs peuvent choisir la position de départ (ligne et colonne) et l'orientation (Horizontal, Vertical, Gauche ou Droite).
- **Rétroaction sur les tirs :** Le programme indique pour chaque tir si le bateau a été "TOUCHÉ" ou si c'est un "PLOUF" (manqué).
- **Entrées interactives via la console :** Toutes les interactions se font à travers des invites dans la console pour une expérience simple.

## Prérequis

- Un kit de développement Java (JDK) installé sur votre machine. Assurez-vous d'avoir au moins la version JDK 8 ou supérieure.
- Un éditeur de code ou un IDE comme IntelliJ IDEA, Eclipse ou Visual Studio Code.

## Comment exécuter le programme

1. Clonez ou téléchargez ce dépôt sur votre machine locale.
2. Ouvrez le projet dans votre éditeur de code ou IDE préféré.
3. Compilez le fichier Java :
   ```
   javac BatailleNavale.java
   ```
4. Lancez le programme compilé :
   ```
   java BatailleNavale
   ```
5. Suivez les instructions à l'écran pour jouer au jeu.

## Instructions de jeu

1. **Placer le bateau :**
   - Saisissez la ligne de départ (1-10) et la colonne de départ (1-10).
   - Choisissez l'orientation :
     - `H` pour horizontal (de gauche à droite).
     - `B` pour vertical (de haut en bas).
     - `D` pour diagonal droite.
     - `G` pour diagonal gauche.
2. **Tirer :**
   - Entrez la ligne et la colonne de votre cible.
   - Le programme vous indiquera si vous avez touché le bateau (`TOUCHÉ`) ou manqué (`PLOUF`).

## Aperçu du code

- **Classe principale :** La classe `BatailleNavale` contient toute la logique pour le placement des bateaux, la validation et l'évaluation des tirs.
- **Représentation de la grille :** La grille est un tableau 2D de caractères (`char[10][10]`), initialisé comme vide.
- **Validation des entrées :** Des vérifications de base sur les entrées garantissent des positions valides sur la grille.

## Limitations

- Les placements des bateaux et les tirs ne sont pas validés pour éviter les dépassements des limites de la grille.
- Aucune fonctionnalité pour gérer plusieurs bateaux ou des tailles de bateaux différentes.
- L'affichage de la grille est limité à des fins de débogage.

## Améliorations futures

- Ajouter une représentation visuelle de la grille pour une meilleure expérience de jeu.
- Supporter plusieurs bateaux de tailles variées.
- Améliorer la validation des entrées pour éviter les erreurs de limites et de chevauchement.

## Exemple de sortie

```
Où souhaitez-vous placer le bateau ?
Numéro de ligne ?
5
Numéro de colonne ?
5
Sens ?
H
Vous souhaitez placer le bateau en ligne 5 et en colonne 5 enfin le sens désiré est H
Où souhaitez-vous tirer ?
Numéro de ligne ?
5
Numéro de colonne ?
5
Vous souhaitez frapper en ligne 5 et en colonne 5
TOUCHÉ
```

## Contributions

Les contributions sont les bienvenues ! N'hésitez pas à forker le dépôt et à soumettre une pull request avec des améliorations ou des corrections de bugs.

Amusez-vous bien en jouant à la Bataille Navale ! ⚓

