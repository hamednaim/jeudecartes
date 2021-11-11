package com.naim.jeudecartes.entite;

import com.naim.jeudecartes.enums.Couleur;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class CardTest {

   @ParameterizedTest
    @MethodSource("cardWithRank")
    void rankTest(Carte carte, String rank) {
       assertThat(carte.index()).isEqualTo(rank);
    }

    private static Stream<Arguments> cardWithRank(){
        return Stream.of(
                Arguments.of(new Carte(1, Couleur.TREFLE), "A"),
                Arguments.of(new Carte(2, Couleur.TREFLE), "2"),
                Arguments.of(new Carte(3, Couleur.TREFLE), "3"),
                Arguments.of(new Carte(4, Couleur.TREFLE), "4"),
                Arguments.of(new Carte(5, Couleur.TREFLE), "5"),
                Arguments.of(new Carte(6, Couleur.TREFLE), "6"),
                Arguments.of(new Carte(7, Couleur.TREFLE), "7"),
                Arguments.of(new Carte(8, Couleur.TREFLE), "8"),
                Arguments.of(new Carte(9, Couleur.TREFLE), "9"),
                Arguments.of(new Carte(10, Couleur.TREFLE), "10"),
                Arguments.of(new Carte(11, Couleur.TREFLE), "J"),
                Arguments.of(new Carte(12, Couleur.TREFLE), "Q"),
                Arguments.of(new Carte(13, Couleur.TREFLE), "K"),

                Arguments.of(new Carte(1, Couleur.CARREAU), "A"),
                Arguments.of(new Carte(2, Couleur.CARREAU), "2"),
                Arguments.of(new Carte(3, Couleur.CARREAU), "3"),
                Arguments.of(new Carte(4, Couleur.CARREAU), "4"),
                Arguments.of(new Carte(5, Couleur.CARREAU), "5"),
                Arguments.of(new Carte(6, Couleur.CARREAU), "6"),
                Arguments.of(new Carte(7, Couleur.CARREAU), "7"),
                Arguments.of(new Carte(8, Couleur.CARREAU), "8"),
                Arguments.of(new Carte(9, Couleur.CARREAU), "9"),
                Arguments.of(new Carte(10, Couleur.CARREAU), "10"),
                Arguments.of(new Carte(11, Couleur.CARREAU), "J"),
                Arguments.of(new Carte(12, Couleur.CARREAU), "Q"),
                Arguments.of(new Carte(13, Couleur.CARREAU), "K"),

                Arguments.of(new Carte(1, Couleur.COEUR), "A"),
                Arguments.of(new Carte(2, Couleur.COEUR), "2"),
                Arguments.of(new Carte(3, Couleur.COEUR), "3"),
                Arguments.of(new Carte(4, Couleur.COEUR), "4"),
                Arguments.of(new Carte(5, Couleur.COEUR), "5"),
                Arguments.of(new Carte(6, Couleur.COEUR), "6"),
                Arguments.of(new Carte(7, Couleur.COEUR), "7"),
                Arguments.of(new Carte(8, Couleur.COEUR), "8"),
                Arguments.of(new Carte(9, Couleur.COEUR), "9"),
                Arguments.of(new Carte(10, Couleur.COEUR), "10"),
                Arguments.of(new Carte(11, Couleur.COEUR), "J"),
                Arguments.of(new Carte(12, Couleur.COEUR), "Q"),
                Arguments.of(new Carte(13, Couleur.COEUR), "K"),

                Arguments.of(new Carte(1, Couleur.PIQUE), "A"),
                Arguments.of(new Carte(2, Couleur.PIQUE), "2"),
                Arguments.of(new Carte(3, Couleur.PIQUE), "3"),
                Arguments.of(new Carte(4, Couleur.PIQUE), "4"),
                Arguments.of(new Carte(5, Couleur.PIQUE), "5"),
                Arguments.of(new Carte(6, Couleur.PIQUE), "6"),
                Arguments.of(new Carte(7, Couleur.PIQUE), "7"),
                Arguments.of(new Carte(8, Couleur.PIQUE), "8"),
                Arguments.of(new Carte(9, Couleur.PIQUE), "9"),
                Arguments.of(new Carte(10, Couleur.PIQUE), "10"),
                Arguments.of(new Carte(11, Couleur.PIQUE), "J"),
                Arguments.of(new Carte(12, Couleur.PIQUE), "Q"),
                Arguments.of(new Carte(13, Couleur.PIQUE), "K")
        );
    }
}
