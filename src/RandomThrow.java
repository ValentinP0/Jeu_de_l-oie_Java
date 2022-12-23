

import java.util.Random;
public class RandomThrow {
    private final int firstDice;
    private final int secondDice;
    private final int sumOfDices;

    public RandomThrow() {
        this.firstDice = throwDice();
        this.secondDice = throwDice();
        this.sumOfDices = addDices();
    }
    public int throwDice() {
        Random random = new Random();
        return 1 + random.nextInt(6);
    }
   public int addDices() {
       return this.firstDice + this.secondDice;
   }
    public int getSumOfDices() {
        return sumOfDices;
    }
    public int getFirstDice() {
        return firstDice;
    }
    public int getSecondDice() {
        return secondDice;
    }
}
