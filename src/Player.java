import java.util.ArrayList;

public class Player {
    public int numberOfPlays=0;
    public String name;
    public boolean canPlay;


    private Position position = new Position(0);
    public ArrayList<Integer> history;


    public Player(int numberOfPlays, String name, boolean canPlay,ArrayList<Integer> history) {
        this.numberOfPlays = 0;
        this.name = name;
        this.canPlay = canPlay;
        this.history= new ArrayList<>();
        // parameters
        /*ArrayList<Integer> history= new ArrayList<>();
        history.add(0,0);*/

    }

    public Position getPosition() {
        return position;
    }

    public int getNumberOfPlays() {
        return numberOfPlays;
    }

    public void setNumberOfPlays(int numberOfPlays) {
        this.numberOfPlays = numberOfPlays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCanPlay() {
        return canPlay;
    }

    public void setCanPlay(boolean canPlay) {
        this.canPlay = canPlay;
    }

    public ArrayList<Integer> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Integer> history) {
        this.history = history;
    }

    public int showPosition(int index){
        return this.history.get(index);
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
