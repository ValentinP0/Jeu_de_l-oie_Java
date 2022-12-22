import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        RandomThrow first = new RandomThrow();
        ArrayList<Integer> positionFirst= new ArrayList<>();
        Player one= new Player(0,"Toto",true,positionFirst);
        ArrayList<Integer> hist= one.history;
        System.out.println(hist);
        int [] testableau= new int[2];

        RandomThrow randomjet= new RandomThrow();
        int jet1= randomjet.generate();
        int jet2 =randomjet.generate();
        testableau=randomjet.getDices();
        System.out.println(testableau[0]);
        System.out.println(testableau[1]);
        int sum=randomjet.sum(testableau);
        System.out.println(sum);


        Board pos1=new Board();
        pos1.ShowCases();
        pos1.showPosition(sum);

    }
}