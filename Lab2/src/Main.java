import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Passimian("Безяна", 1));
        b.addAlly(new Eelektrik("Бычий Цепень", 1));
        b.addAlly(new Tynamo("Головастик", 1));
        b.addFoe(new Eelektross("Мишенерукий", 1));
        b.addFoe(new Ursaring("Круговой медведь", 1));
        b.go();
    }
}
