import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Confide extends StatusMove {

    public Confide(){
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.addEffect(new Effect().stat(Stat.SPECIAL_ATTACK, -1));
    }

    @Override
    protected String describe() {
        return "\n Покемон рассказывает врагу секрет, и тот теряет концентрацию. Специальная Атака цели понижена";
    }
}
