import java.util.ArrayList;

public class Position {

    private int caseNumber = 0;
    public ArrayList<Integer> positions;
    public final int end=63;

    public Position(int caseNumber) {
        this.caseNumber = caseNumber;
    }
    // list of different special cases

    public ArrayList<Integer> getPositions() {
        return positions;
    }
}
