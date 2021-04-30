package noVisitorPattern;

public class Example{
    public static void main(String []args){
        Character joker    = new Joker();
        Character batman   = new Batman();
        Character superman = new Superman();

        joker.interact(batman);    //Wanted output: "Why so serious?"
        superman.interact(batman); //Wanted output: "withoutVisitorPattern.Superman says hi to withoutVisitorPattern.Batman"
    }
}
