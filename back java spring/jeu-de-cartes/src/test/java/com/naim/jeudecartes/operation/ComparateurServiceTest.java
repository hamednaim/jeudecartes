package com.naim.jeudecartes.operation;

import com.naim.jeudecartes.entite.Carte;
import com.naim.jeudecartes.util.Comparateur;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.Comparator;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;


class ComparateurServiceTest {


    private CarteOperation carteOperation = new CarteOperation();

    @Test
    void servireTest() {
        //When
        var liste = carteOperation.servire();
        //Then
        assertThat(liste).isNotNull();
        assertThat(liste.getUnsortedList()).hasSize(10);
        assertThat(liste.getSortedList()).hasSize(10);
    }

}