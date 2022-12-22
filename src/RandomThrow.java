

import java.util.Random;
public class RandomThrow {
    private int firstDice = 0;
    private int secondDice = 0;
    private int sumOfDices = 0;

    public RandomThrow() {
        this.firstDice = generate();
        this.secondDice = generate();
        this.sumOfDices = sum();
    }

    public int generate(){
        Random random = new Random();
        return 1+random.nextInt(6);
    }

   public int sum(){
       return this.firstDice+this.secondDice;
   }

    public int getFirstDice() {
        return firstDice;
    }

    public int getSecondDice() {
        return secondDice;
    }

    public int getSumOfDices() {
        return sumOfDices;
    }

    /*   public int [] getDices(){
        results[0]=generate();
        results[1]=generate();
        return results;
   }*/
}
