package Pokemons;

import Moves.Swagger;

public class Eelektross extends Eelektrik {
    public Eelektross(String name, int level) {
        super(name, level);
        setStats(85, 115, 80, 105, 80, 50);
        addMove(new Swagger());
    }
}
