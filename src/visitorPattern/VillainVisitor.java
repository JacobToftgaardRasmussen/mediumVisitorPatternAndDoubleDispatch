package visitorPattern;

public interface VillainVisitor {
    void visitBatman(Batman batman);
    void visitIronman(Ironman ironman);
    void visitSuperman(Superman superman);
}
