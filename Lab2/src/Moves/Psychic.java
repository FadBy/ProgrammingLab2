package Moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Psychic extends SpecialMove {

    public Psychic() {
        super(Type.PSYCHIC, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect effect = new Effect(); 
        p.addEffect(effect.stat(Stat.SPECIAL_DEFENSE, -1).chance(0.1));
    }

    @Override
    protected String describe() {
        return "\n Покемон бьёт врага телекинетическим ударом";
    }
}
