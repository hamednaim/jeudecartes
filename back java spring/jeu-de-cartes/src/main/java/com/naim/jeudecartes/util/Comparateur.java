package com.naim.jeudecartes.util;

import com.naim.jeudecartes.entite.Carte;
import com.naim.jeudecartes.enums.Couleur;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * La classe comparateur contient les methodes de comparaison
 */
public class Comparateur {
    private final TriListe triListe = new TriListe();

    public List<Couleur> couleursTrie() {
        return triListe.getTriCouleurs();
    }

    public List<Integer> numeroTrie() {
        return triListe.getTriNumeros();
    }

    /**
     * @return comparateur qui melande les deux comparateurs par couleurs et par numero
     */
    private Comparator<Carte> comparator() {
        Comparator<Carte> comparateurCouleur = Comparator.comparingInt(card -> couleursTrie().indexOf(card.getCouleur()));
        Comparator<Carte> comparateurNumero = Comparator.comparingInt(card -> numeroTrie().indexOf(card.getNumero()));
        return comparateurCouleur.thenComparing(comparateurNumero);
    }

    /**
     * @param listeCartes : liste des cartes à trier
     * @return
     */
    public List<Carte> trier(Collection<Carte> listeCartes) {
        return listeCartes.stream().sorted(comparator()).collect(Collectors.toList());
    }


}
