package com.naim.jeudecartes.entite;

import com.naim.jeudecartes.enums.Couleur;
import com.naim.jeudecartes.enums.TypeCarte;
import org.apache.logging.log4j.util.Strings;

import java.util.Optional;

/**
 * une entite qui defini les proprietes de la carte
 */
public class Carte {
    private final int numero;
    private final Couleur couleur;
    private final String index;

    /**
     * un constructeur
     * @param numero
     * @param couleur
     */
    public Carte(int numero, Couleur couleur) {
        this.numero = numero;
        this.couleur = couleur;
        this.index = index();
    }

    /**
     * @return optional typeCarte
     */
    public Optional<TypeCarte> getTypeCarte(){
        return Optional.of(TypeCarte.valueOf(this.numero));
    }

    /**
     * @return index
     */
    public String index(){
        return getTypeCarte()
                .map(TypeCarte::getIndex)
                .filter(Strings::isNotBlank)
                .orElse(String.valueOf(this.numero));
    }

    /**
     * @return Numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @return couleur
     */
    public Couleur getCouleur() {
        return couleur;
    }

    /**
     * @return index
     */
    public String getIndex() {
        return index;
    }
}
