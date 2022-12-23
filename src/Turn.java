public class Turn {
    Player player;
    RandomThrow randomThrow;
    boolean ongoing = true;
    int lastCell = 63;

    public Turn(Player player) {
        this.player = player;
        throwDice();
    }
    public void throwDice() {
        randomThrow = new RandomThrow();
    }
    public void changeCell() {
        player.incrementTurn();
        int cell = player.getBoardCell() + randomThrow.getSumOfDices();
        if (cell == lastCell) {
            ongoing = false;
        } else if (cell > lastCell) {
            cell = lastCell - (cell - lastCell);
        }
        player.setBoardCell(cell);
        displayDestinationCell(cell);
    }
    public void displayDestinationCell(int casePosition) {
        System.out.printf("Tour %d: %s arrive à la case n°%d%n", player.getTurn(), player.getName(), casePosition);
    }
}