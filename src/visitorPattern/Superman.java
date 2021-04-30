package visitorPattern;

public class Superman implements Superhero {
    public void accept(VillainVisitor visitor) { visitor.visitSuperman(this); }
}
