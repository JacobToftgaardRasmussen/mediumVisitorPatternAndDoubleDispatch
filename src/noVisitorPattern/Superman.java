package noVisitorPattern;

public class Superman implements Character {
    public void interact()                    { System.out.println("Superman meets nobody"); }
    public void interact(Joker joker)         { System.out.println("Superman thinks this is strange"); }
    public void interact(Batman batman)       { System.out.println("Superman says hi to Batman");}
    public void interact(Superman superman)   { System.out.println("Superman meets himself"); }
    public void interact(Character character) { System.out.println("Superman meets a general character"); }
}
