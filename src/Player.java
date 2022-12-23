public class Player {
    private final String name;
    private int boardCell;
    private int turn;

    private char symbol;

    public Player(String name, char symbol) {
        this.name = name;
        this.boardCell = 0;
        this.turn = 0;
        this.symbol = symbol;
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

    public char getSymbol() {
        return symbol;
    }
}
