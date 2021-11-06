package Pokemons;

import Moves.Agility;
import Moves.Confide;
import Moves.DoubleTeam;
import Moves.Harden;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Passimian extends Pokemon {

    public Passimian(String name, int level) {
        super(name, level);
        addType(Type.FIGHTING);
        setStats(100, 120, 90, 40, 60, 80);
        addMove(new Agility());
        addMove(new Confide());
        addMove(new DoubleTeam());
        addMove(new Harden());
    }
}