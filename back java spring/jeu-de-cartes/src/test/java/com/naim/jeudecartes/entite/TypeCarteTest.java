package com.naim.jeudecartes.entite;

import com.naim.jeudecartes.enums.TypeCarte;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class TypeCarteTest {

    @ParameterizedTest
    @MethodSource("exempleDeTest")
    void typesTest(Integer value, TypeCarte expected) {
        assertThat(TypeCarte.valueOf(value)).isEqualTo(expected);
    }

    private static Stream<Arguments> exempleDeTest(){
        return Stream.of(
                Arguments.arguments(1, TypeCarte.AS),
                Arguments.arguments(11, TypeCarte.VALET),
                Arguments.arguments(12, TypeCarte.DAME),
                Arguments.arguments(13, TypeCarte.ROI),
                Arguments.arguments(2, TypeCarte.RIEN),
                Arguments.arguments(3, TypeCarte.RIEN),
                Arguments.arguments(4, TypeCarte.RIEN),
                Arguments.arguments(5, TypeCarte.RIEN),
                Arguments.arguments(6, TypeCarte.RIEN),
                Arguments.arguments(7, TypeCarte.RIEN),
                Arguments.arguments(8, TypeCarte.RIEN),
                Arguments.arguments(9, TypeCarte.RIEN),
                Arguments.arguments(10, TypeCarte.RIEN)
        );
    }


}