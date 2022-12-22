public class Turn {
    Player player;
    RandomThrow PlayerThrow;
    Position position;

    boolean ongoing = true;


    public Turn(Player player) {
        this.player = player;
        throwDice();
    }

    public boolean isOngoing() {
        return ongoing;
    }

    public void throwDice() {
        this.PlayerThrow = new RandomThrow();
    }

    public void changePosition() {
       int casePosition = player.getPosition().getCaseNumber() + PlayerThrow.getSumOfDices();
       if(casePosition > 63) {
           casePosition = 63 - (casePosition - 63);
           this.player.setPosition(new Position(casePosition));
           System.out.println(casePosition);
       } else if(casePosition == 63) {
           this.ongoing = false;
           this.player.setPosition(new Position(casePosition));
           System.out.println(casePosition);
           System.out.println("You Won !");
       } else {
           this.player.setPosition(new Position(casePosition));
           System.out.println(casePosition);
       }
    }

}
