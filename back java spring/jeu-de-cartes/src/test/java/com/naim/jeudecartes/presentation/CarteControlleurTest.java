package com.naim.jeudecartes.presentation;

import com.naim.jeudecartes.entite.ListeCartes;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CarteControlleurTest {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void jouer() throws Exception {
                    mockMvc.perform(get("/jouer")).andExpect(status().isOk())
                            .andExpect(content -> {
                                var liste = objectMapper.readValue(content.getResponse().getContentAsString(), ListeCartes.class);
                                assertThat(liste.getSortedList()).isNotEmpty();
                                assertThat(liste.getUnsortedList()).isNotEmpty();
                            });
    }


}
