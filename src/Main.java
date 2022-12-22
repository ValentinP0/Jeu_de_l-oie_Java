import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //System.out.println("Hello world!");
        RandomThrow first = new RandomThrow();
        ArrayList<Integer> positionFirst= new ArrayList<>();
        Player one = new Player(0,"Toto",true,positionFirst);
        ArrayList<Integer> hist= one.history;
        System.out.println(hist);
//
//        RandomThrow randomjet= new RandomThrow();
//        int jet1= randomjet.generate();
//        int jet2 =randomjet.generate();
//        int sum= randomjet.sum();
//        System.out.println(randomjet.getFirstDice());
//        System.out.println(randomjet.getSecondDice());
//
//        System.out.println(sum);
        boolean ongoing = true;
        int count = 0;
        while(ongoing) {
            Turn turn = new Turn(one);
            turn.changePosition();
            if(turn.ongoing == false) {
                ongoing = false;
            } else {
                count++;
            }
        }
        System.out.println(count);

        Board pos1=new Board();
        pos1.ShowCases();

        pos1.showPosition(one.getPosition().getCaseNumber());

//        while(ongoing) {
////            Game game = new Game();
//        }

    }
}