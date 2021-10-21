public class Eelektross extends Eelektrik {
    public Eelektross(String name, int level){
        super(name, level);
        addMove(new Swagger());
    }
}
