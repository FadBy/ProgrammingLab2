import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Charm extends StatusMove{

    public Charm(){
        super(Type.FAIRY, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.addEffect(new Effect().stat(Stat.ATTACK, -2));
    }

    @Override
    protected String describe() {
        return "\n Покемон очаровательно глядит на цель, усыпляя его бдительность. Атака цели резко понижается";
    }
}
