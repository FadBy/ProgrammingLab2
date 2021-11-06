package Moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Agility extends StatusMove {

    public Agility() {
        super(Type.PSYCHIC, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect effect = new Effect(); 
        p.addEffect(effect.stat(Stat.SPEED, 2));
    }

    @Override
    protected String describe() {
        return "\n Покемон расслабляет и облегчает своё тело, чтобы двигаться быстрее. Скорость значительно повышена";
    }

}
