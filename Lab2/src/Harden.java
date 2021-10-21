import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Harden extends StatusMove{

    public Harden(){
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.addEffect(new Effect().stat(Stat.DEFENSE, 1));
    }

    @Override
    protected String describe() {
        return "\n Покемон напрягает свои мускулы, чтобы стать прочнее камня. Защита повышена";
    }
}
