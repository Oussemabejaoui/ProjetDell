#Author: Oussema Bejaoui

Feature: Dell DellHome
Scenario: choisir un produit
Given Utilisateur en page dacceuil
When utilisateur passe la souris sur le menu "Ordinateurs et accessoires" et sousmenu "Ordinateurs portables" 
And utilisateur choisis "Ordinateurs portables XPS"
Then utilisateur se derige vers la page qui contient "Ordinateurs portables XPS"
