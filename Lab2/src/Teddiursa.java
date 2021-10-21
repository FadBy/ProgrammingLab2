import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Teddiursa extends Pokemon {
    public Teddiursa(String name, int level){
        super(name, level);
        addType(Type.NORMAL);
        setStats(60, 80, 50, 50, 50, 40);
        addMove(new Leer());
        addMove(new Swagger());
        addMove(new Confide());
    }
}
