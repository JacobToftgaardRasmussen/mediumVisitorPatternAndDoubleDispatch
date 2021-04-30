package visitorPattern;

public class JokerVisitor implements VillainVisitor{
    public void visitBatman(Batman batman)       { System.out.println("Why so serious?"); }
    
    public void visitIronman(Ironman ironman)    { System.out.println("Hello there Tin man"); }
    
    public void visitSuperman(Superman superman) { System.out.println("HAHAHA nice outfit"); }
}
