

import java.util.Random;
public class RandomThrow {
    int [] results = new int[2];



    public int generate(){
        Random random = new Random();
        return 1+random.nextInt(6);
    }
   public int [] getDices(){
        results[0]=generate();
        results[1]=generate();
        return results;
   }
   public int sum(int[] results){
        return results[0]+results[1];
   }
}
