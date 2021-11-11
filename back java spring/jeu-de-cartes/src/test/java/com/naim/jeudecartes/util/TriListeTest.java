package com.naim.jeudecartes.util;

import com.naim.jeudecartes.enums.Couleur;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class TriListeTest {

    @Test
    void triCouleursTest() {
        //Given
        var order = new TriListe();

        //when
        var colorOrder = order.getTriCouleurs();

        //Then
        assertThat(colorOrder).hasSize(4);
        assertThat(colorOrder).containsExactlyInAnyOrder(Couleur.TREFLE, Couleur.CARREAU, Couleur.COEUR, Couleur.PIQUE);

    }


    @Test
    void triNumerosTest() {
        //Given
        var order = new TriListe();

        //when
        var colorOrder = order.getTriNumeros();

        //Then
        assertThat(colorOrder).hasSize(10);
        assertThat(colorOrder).allMatch(value -> value >= 1 && value <= 13);
    }

    @Test
    void mixerCouleursTest() {
        //Given
        var order = new TriListe();
        //When
        var colors = order.getListeTrierCouleurs();
        //Then
        assertThat(colors).isNotEmpty();
        assertThat(colors).hasSize(4);
        assertThat(colors).containsOnly(Couleur.TREFLE, Couleur.CARREAU, Couleur.COEUR, Couleur.PIQUE);
    }
}