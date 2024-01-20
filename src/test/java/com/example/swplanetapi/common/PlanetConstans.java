package com.example.swplanetapi.common;

import com.example.swplanetapi.domain.Planet;

import java.util.ArrayList;
import java.util.List;

public class PlanetConstans {

    public static final Planet PLANET = new Planet("Marte", "Neve", "Montanhoso");
    public static final Planet INVALID_PLANET = new Planet("", "", "");

    public static final Planet TATOOINE = new Planet(1L, "Tatooine", "arid", "desert");
    public static final Planet ALDERAAN = new Planet(2L, "Alderaan", "temperate", "grasslands, mountains");
    public static final Planet YAVINIV = new Planet(3L, "Yavin IV", "temperate, tropical", "jungle, rainforests");
    public static final List<Planet> PLANETS = new ArrayList<>() {
        {
            add(TATOOINE);
            add(ALDERAAN);
            add(YAVINIV);
        }
    };

}
