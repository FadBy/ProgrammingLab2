public class Eelektrik extends Tynamo {
    public Eelektrik(String name, int level){
        super(name, level);
        addMove(new Charm());
    }
}
