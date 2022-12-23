import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Player> playerList = new ArrayList<>();
        ArrayList<Boolean> playersCanPlay= new ArrayList<>();
        ArrayList<Integer> penalties=new ArrayList<>();

        boolean registerPlayers = true;

        while (registerPlayers){
            System.out.println("Entrez votre nom ou x pour en sortir ");
            String s = scan.next();
            if( s.equals("x") && !playerList.isEmpty()){
                registerPlayers = false;
            } else if(s.equals("x") && playerList.isEmpty()){
                System.out.println("Impossible de lancer la partie sans joueur");
            } else {
                Random random = new Random();
                char symbol = (char)(random.nextInt(0 ,26) + 'A');

                Player player = new Player(s,symbol);
                playerList.add(player);
                System.out.println(player.getName() + " à été créé");
            }
        }
        for (int k=0;k<playerList.size();k++){
            playersCanPlay.add(k,true);
        }
        for (int k=0;k<playerList.size();k++){
            penalties.add(k,0);
        }

        System.out.println(penalties.get(0));
        System.out.println(playersCanPlay.get(0));
        boolean ongoing = true;
        int countTours = 1;
        Board gameBoard = new Board();
        Ruler theBoss= new Ruler(playerList,playersCanPlay,penalties);
        while(ongoing) {

            System.out.printf("Turn %d :%n", countTours);
            for(int i = 0; i < playerList.size(); i++){
                Turn turn = new Turn(playerList.get(i));
                if (playerList.get(i).getBoardCell()==0){
                    //System.out.println("tour initial");
                    turn.firstChangeCell();
                    theBoss.ruling(i);

                }
                else {
                    turn.changeCell();
                    theBoss.ruling(i);
                }
                if(!turn.ongoing) {
                    ongoing = false;
                    System.out.printf("Player %s Won !%n", playerList.get(i).getName());
                }
            }
            gameBoard.ShowCases();
            for(int i = 0; i < playerList.size(); i++){
                gameBoard.showPosition(playerList.get(i).getBoardCell(), playerList.get(i).getSymbol());
            }
            countTours++;

        }
        System.out.println("Nb Tours : " + (countTours-1));
        System.out.println(playersCanPlay.get(0));
        System.out.println(playersCanPlay.get(1));
        System.out.println(penalties.get(0));

    }
}