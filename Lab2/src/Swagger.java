import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Swagger extends StatusMove{

    public Swagger(){
        super(Type.NORMAL, 0, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.addEffect(new Effect().stat(Stat.ATTACK, 2));
        p.confuse();
    }

    @Override
    protected String describe() {
        return "\n Покемон раздражает и сбивает цель с толку. Атака цели значительно повышена, но враг сильно сконфужен";
    }
}
