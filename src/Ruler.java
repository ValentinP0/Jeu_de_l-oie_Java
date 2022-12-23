import java.util.ArrayList;

public class Ruler {
   private ArrayList<Player> setOfPlayer;

    private ArrayList<Boolean> playerCanPlay;

    private ArrayList<Integer> penalties;
   // private CellManager cellManager;

    public Ruler(ArrayList<Player> setOfPlayer,ArrayList<Boolean> playerCanPlay,ArrayList<Integer> penalties){
        this.playerCanPlay=playerCanPlay;
        this.setOfPlayer=setOfPlayer;
        this.penalties=penalties;
    }




    public void ruling(int index){

        int cell= setOfPlayer.get(index).getBoardCell();
        CellManager cellManager= new CellManager();
        if (cellManager.isOnHostel(cell))
        {
            playerCanPlay.add(index,false);
            penalties.add(index,2);
        }
        else if(cellManager.isOnPrison(cell)){
            playerCanPlay.add(index,false);
            penalties.add(index,10);

        }
        else if(cellManager.isOnWell(cell)){
            playerCanPlay.add(index,false);
            penalties.add(index,10);
        }


    }
    /*public Player giveTheTurn(ArrayList<Player>players){
        return ;
    }*/
}
