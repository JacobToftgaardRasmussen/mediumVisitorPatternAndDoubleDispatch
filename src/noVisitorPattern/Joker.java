package noVisitorPattern;

public class Joker implements Character {
    public void interact()                    { System.out.println("Joker meets nobody"); }
    public void interact(Joker joker)         { System.out.println("Joker meets himself"); }
    public void interact(Batman batman)       { System.out.println("Why so serious?"); }
    public void interact(Superman superman)   { System.out.println("Joker thinks this is strange"); }
    public void interact(Character character) { System.out.println("Joker meets a general character"); }
}
