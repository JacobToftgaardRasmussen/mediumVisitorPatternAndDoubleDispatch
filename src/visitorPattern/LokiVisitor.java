package visitorPattern;

public class LokiVisitor implements VillainVisitor{
    public void visitBatman(Batman batman)       { System.out.println("I am a god! puny human"); }
    
    public void visitIronman(Ironman ironman)    { System.out.println("Your technology will not stop me!"); }
    
    public void visitSuperman(Superman superman) { System.out.println("Finally a bit of a fight"); }
}
