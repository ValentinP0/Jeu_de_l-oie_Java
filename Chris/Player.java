import java.util.ArrayList;

public class Player {
    public int numberOfPlays=0;
    public String name;
    public boolean canPlay;
    public ArrayList<Integer> history;


    public Player(int numberOfPlays, String name, boolean canPlay) {
        this.numberOfPlays = 0;
        this.name = name;
        this.canPlay = canPlay;
        // parameters
        /*ArrayList<Integer> history= new ArrayList<>();
        history.add(0,0);*/

    }
}
