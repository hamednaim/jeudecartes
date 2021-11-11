package com.naim.jeudecartes.util;

import com.naim.jeudecartes.enums.Couleur;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * classe qui fait le tri des numeros et des couleurs
 */
public class TriListe {
    private static final Random ALEA = new Random();
    private final List<Integer> triNumeros = getNumerosNonTrier();
    private final List<Couleur> triCouleurs = getListeTrierCouleurs();

    public List<Integer> getTriNumeros() {
        return triNumeros;
    }

    public List<Couleur> getTriCouleurs() {
        return triCouleurs;
    }

    /**
     * @return une liste des numeros triée
     */
    private static List<Integer> getNumerosNonTrier() {
        return IntStream.range(0, 10)
                    .map(i -> ALEA.nextInt(13) + 1)
                .boxed()
                .collect(Collectors.toList());
    }

    /**
     * @return une liste des couleurs triée
     */
     List<Couleur> getListeTrierCouleurs() {
        var couleurs = Arrays.asList(Couleur.values());
        Collections.shuffle(couleurs);
        return couleurs;
    };

}
