package com.naim.jeudecartes.enums;


import org.apache.logging.log4j.util.Strings;
import java.util.Map;

/**
 * Enum des types d'une carte
 */
public enum TypeCarte {
    AS("AS", "A"),
    VALET("Valet", "J"),
    DAME("Dame", "Q"),
    ROI("Roi", "K"),
    RIEN(Strings.EMPTY, Strings.EMPTY);
    private final String type;
    private final String index;
    private static final Map<Integer, TypeCarte> values = Map.of(1, AS, 11, VALET, 12, DAME, 13, ROI);

    public static TypeCarte valueOf(int value){
        return values.getOrDefault(value, RIEN);
    }

    /**
     * un constructeur
     * @param type : type de la carte
     * @param index : index de la carte
     */
    TypeCarte(String type, String index) {
        this.type = type;
        this.index = index;
    }

    public String getType() {
        return type;
    }

    public String getIndex() {
        return index;
    }
}
