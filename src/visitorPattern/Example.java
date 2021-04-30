package visitorPattern;

public class Example {
    public static void main(String[] args) {
        Superhero batman = new Batman();
        Superhero ironman = new Ironman();
        Superhero superman = new Superman();

        VillainVisitor lokiVisitor = new LokiVisitor();
        VillainVisitor jokerVisitor = new JokerVisitor();

        batman.accept(jokerVisitor);   //Wanted output: "Why so serious?"
        batman.accept(lokiVisitor);    //Wanted output: "I am a god! puny human"

        ironman.accept(jokerVisitor);  //Wanted output: "Hello there Tin man"
        ironman.accept(lokiVisitor);   //Wanted output: "Your technology will not stop me!
        
        superman.accept(jokerVisitor); //Wanted output: "HAHAHA nice outfit"
        superman.accept(lokiVisitor);  //Wanted output: "Finally a bit of a fight"
    }
}
