public class Player {
    private final String name;
    private int boardCell;
    private int turn;

    public Player(String name) {
        this.name = name;
        this.boardCell = 0;
        this.turn = 0;
    }

    public void incrementTurn() {
        turn++;
    }
    public String getName() {
        return name;
    }
    public int getBoardCell() {
        return boardCell;
    }
    public void setBoardCell(int boardCell) {
        this.boardCell = boardCell;
    }

    public int getTurn() {
        return this.turn;
    }
}
