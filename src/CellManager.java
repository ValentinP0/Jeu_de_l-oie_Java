public class CellManager {
    int[] geese = new int[] {9,18,27,36,45,54};
    int labyrinth =42;
    int well = 3;
    int hostel = 19;
    int prison = 52;
    int skull = 58;
    public boolean isOnGoose(int caseNumber){
        boolean test=false;
        for (int i=0;i<6;i++){
            if (geese[i]==caseNumber){

                test=true;
            }
        }
        return test;

    }
    public boolean isOnLabyrinth(int caseNumber){

        return (caseNumber==labyrinth);
    }
    public boolean isOnWell(int caseNumber){
        return (caseNumber==well);
    }
    public  boolean isOnHostel(int caseNumber){
        return (caseNumber==hostel);
    }
    public boolean isOnPrison(int caseNumber){
        return (caseNumber==prison);
    }
    public boolean isOnSkull(int caseNumber){
        return (caseNumber==skull);
    }

    public int scanCell(int cell, RandomThrow randomThrow, String playerName) {
        if (isOnGoose(cell)) {
            System.out.println(playerName + " est sur une oie!!! " + cell);
            return cell + randomThrow.getSumOfDices();
        } else if(isOnLabyrinth(cell)) {
            System.out.println(playerName+ " est tombé dans le labyrinthe");
            return 30;
        }
        else if(isOnSkull(cell)){
            System.out.println(playerName + " est sur Case " + cell + " ! Vous recomencez la partie");
            return 1;
        }
        else {
            return cell;
        }
    }
}
