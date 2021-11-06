import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Eelektross("Бычий Цепень", 1));
        b.addAlly(new Ursaring("Круговой медведь", 1));
        b.addAlly(new Ursaring("Ещё один", 1));
        b.addFoe(new Tynamo("Тинамо", 1));
        b.addFoe(new Teddiursa("Тедди", 1));
        b.addFoe(new Passimian("Пасс", 1));
        b.addFoe(new Eelektrik("Электрик", 1));
        b.go();
    }
}
