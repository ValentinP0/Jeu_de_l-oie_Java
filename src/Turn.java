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

    public void changePosition(){
       int casePosition = player.getPosition().getCaseNumber() + PlayerThrow.getSumOfDices();
       this.player.setPosition(new Position(casePosition));
    }

}
