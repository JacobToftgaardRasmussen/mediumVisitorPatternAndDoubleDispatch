package visitorPattern;

public class Batman implements Superhero {
    public void accept(VillainVisitor visitor) { visitor.visitBatman(this); }
}
