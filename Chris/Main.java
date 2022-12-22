import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Randomjet first = new Randomjet();
        Player one= new Player(0,"Toto",true);
       ArrayList<Integer> hist= one.history;
       System.out.println(hist);

        int cpt = 0;
        while (cpt < 100) {
            int test = first.generate();
            //System.out.println(test);
            int test2 = first.generate2();
            //System.out.println(test2);
            cpt++;
        }

    }
}