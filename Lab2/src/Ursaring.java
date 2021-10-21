public class Ursaring extends Teddiursa {
    public Ursaring(String name, int level){
        super(name, level);
        addMove(new Psychic());
    }
}
