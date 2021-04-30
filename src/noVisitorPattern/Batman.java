package noVisitorPattern;

public class Batman implements Character {
    public void interact()                    { System.out.println("Batman meets nobody"); }
    public void interact(Joker joker)         { System.out.println("KAPOW! BANG! WHAM! CRASH!"); }
    public void interact(Batman batman)       { System.out.println("Batman meets Himself"); }
    public void interact(Superman superman)   { System.out.println("Batman says hi to withoutVisitorPattern.Superman"); }
    public void interact(Character character) { System.out.println("Batman meets a general character"); }
}
