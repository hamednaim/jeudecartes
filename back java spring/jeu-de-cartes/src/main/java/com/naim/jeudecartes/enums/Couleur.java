package com.naim.jeudecartes.enums;

/**
 * l'ensemble des couleurs d'une carte
 */
public enum Couleur {
    TREFLE("Trèfle"),
    CARREAU("Carreau"),
    COEUR("Coeur"),
    PIQUE("Pique");
    private final String couleur;

    Couleur(String couleur) {
        this.couleur = couleur;
    }
}
