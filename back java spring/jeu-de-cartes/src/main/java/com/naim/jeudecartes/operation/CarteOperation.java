package com.naim.jeudecartes.operation;

import com.naim.jeudecartes.entite.ListeCartes;
import com.naim.jeudecartes.util.Comparateur;
import com.naim.jeudecartes.util.GenerateurCartes;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.stream.Collectors;

/**
 * la classe operation ou traitement du projet
 */
@Service
public class CarteOperation {

    /**
     * @return deux liste ( liste triée & liste non triée)
     */
    public ListeCartes servire() {
        var liste = GenerateurCartes.generer();
        Collections.shuffle(liste);
        var carteGenerees = liste.stream().limit(10).collect(Collectors.toList());
        return new ListeCartes(carteGenerees, new Comparateur().trier(carteGenerees));
    }

}
