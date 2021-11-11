package com.naim.jeudecartes.entite;

import java.util.List;

/**
 * une entite qui contient kes deux liste demandé
 */
public class ListeCartes {
    private List<Carte> unsortedList;
    private List<Carte> sortedList;

    public ListeCartes() {
    }

    public ListeCartes(List<Carte> unsortedList, List<Carte> sortedList) {
        this.unsortedList = unsortedList;
        this.sortedList = sortedList;
    }

    /**
     * @return la liste non triée
     */
    public List<Carte> getUnsortedList() {
        return unsortedList;
    }

    /**
     * @return la liste triée
     */
    public List<Carte> getSortedList() {
        return sortedList;
    }

}
