public class Turn {
    Player player;
    RandomThrow PlayerThrow;
    Position position;

    public Turn(Player player) {
        this.player = player;
        throwDice();
    }

    public void throwDice() {
        this.PlayerThrow = new RandomThrow();
    }
}
