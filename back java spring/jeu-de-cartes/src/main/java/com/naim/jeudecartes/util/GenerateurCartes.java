package com.naim.jeudecartes.util;

import com.naim.jeudecartes.entite.Carte;
import com.naim.jeudecartes.enums.Couleur;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * une classe qui genere une liste des cartes
 */
public class GenerateurCartes {

    /**
     * @return une liste des carte générée
     */
    public static List<Carte> generer() {
        return IntStream.range(1, 14)
                .mapToObj(numero -> List.of(
                        new Carte(numero, Couleur.TREFLE),
                        new Carte(numero, Couleur.COEUR),
                        new Carte(numero, Couleur.CARREAU),
                        new Carte(numero, Couleur.PIQUE)
                        ))
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    };
}
