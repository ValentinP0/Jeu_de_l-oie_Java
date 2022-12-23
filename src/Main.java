import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Player> playerList = new ArrayList<>();

        boolean chose = true;
        while (chose){
            System.out.println("Entrez votre nom ou x pour en sortir ");
            String s = scan.next();
            if( s.equals("x") && !playerList.isEmpty()){
                chose = false;
            } else if(s.equals("x") && playerList.isEmpty()){
                System.out.println("Impossible de lancer la partie sans joueur");
            } else {
                Player playerOne = new Player(s);
                playerList.add(playerOne);
                System.out.println(playerOne.getName() + " à été créer");
            }

        }

        boolean ongoing = true;
        int count = 0;
        Board gameBoard = new Board();

        while(ongoing) {

            Turn turn = new Turn(playerList.get(0));
            if (playerList.get(0).getBoardCell()==0){
                System.out.println("tour initial");
                turn.firstChangeCell();
            }
            else {
                turn.changeCell();
            }

                gameBoard.ShowCases();
                gameBoard.showPosition(playerList.get(0).getBoardCell());
            if(!turn.ongoing) {
                ongoing = false;
                System.out.println("You Won !");
            }
            count++;

        }
        System.out.println(count);

    }
}