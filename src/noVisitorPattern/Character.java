package noVisitorPattern;

public interface Character {
    void interact();
    void interact(Joker joker);
    void interact(Batman batman);
    void interact(Superman superman);
    void interact(Character movieCharacter);
}