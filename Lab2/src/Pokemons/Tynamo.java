package Pokemons;

import Moves.RockSlide;
import Moves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Tynamo extends Pokemon {

    public Tynamo(String name, int level) {
        super(name, level);
        addType(Type.ELECTRIC);
        setStats(35, 55, 40, 45, 40, 60);
        addMove(new RockSlide());
        addMove(new Swagger());
    }
}