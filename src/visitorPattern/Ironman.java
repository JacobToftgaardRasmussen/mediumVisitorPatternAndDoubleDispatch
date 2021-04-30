package visitorPattern;

public class Ironman implements Superhero {
    public void accept(VillainVisitor visitor) { visitor.visitIronman(this); }
}
