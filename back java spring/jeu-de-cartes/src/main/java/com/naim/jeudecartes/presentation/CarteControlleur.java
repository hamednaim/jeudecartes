package com.naim.jeudecartes.presentation;

import com.naim.jeudecartes.entite.ListeCartes;
import com.naim.jeudecartes.operation.CarteOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * La couche presentation ou le controlleur
 */
@RestController
@RequestMapping
public class CarteControlleur {
    private final CarteOperation carteOperation;

    /**
     * @param carteOperation constructeur
     */
    public CarteControlleur(CarteOperation carteOperation) {
        this.carteOperation = carteOperation;
    }

    /**
     * @return API Rest qui expose le jeu
     */
    @CrossOrigin(origins = "*")
    @GetMapping(value = "/jouer")
    public ListeCartes jouer() {
        return carteOperation.servire();
    }


}
