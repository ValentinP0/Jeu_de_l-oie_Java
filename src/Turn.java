public class Turn {
    Player player;
    RandomThrow randomThrow;
    boolean ongoing = true;
    int lastCell = 63;

    public Turn(Player player) {
        this.player = player;
        throwDice();
    }
    public void throwDice() {
        randomThrow = new RandomThrow();
    }
    public void changeCell() {
        player.incrementTurn();
        int cell = player.getBoardCell() + randomThrow.getSumOfDices();
        if (cell == lastCell) {
            ongoing = false;
        } else if (cell > lastCell) {
            cell = lastCell - (cell - lastCell);
        }
        cell = new CellManager().scanCell(cell, randomThrow, player.getName());
        player.setBoardCell(cell);
        displayDestinationCell(cell);
    }
    public void displayDestinationCell(int casePosition) {
        System.out.printf("%s arrive à la case n°%d (%d,%d) %n", player.getName(), casePosition, randomThrow.getFirstDice(), randomThrow.getSecondDice());
    }
    public void firstChangeCell(){
        player.incrementTurn();

        int Dice1= randomThrow.getFirstDice();
        int Dice2= randomThrow.getSecondDice();
        int sum= randomThrow.getSumOfDices();
        if ((sum==9)&&((Dice1==6)||(Dice2==6))){
            System.out.println("9 par 6 et 3");
            player.setBoardCell(26);
            displayDestinationCell(26);
        }
        else if ((sum==9)&&((Dice1==4)||(Dice2==5))){
            System.out.println("9 par 4 et 5");
            player.setBoardCell(53);
            displayDestinationCell(53);
        }
        else if (sum==6){
            System.out.println("Somme égale à 6");
            player.setBoardCell(12);
            displayDestinationCell(12);
        }
        else {
            //int cell = randomThrow.getSumOfDices();

            //cell = cell + new CellManager().scanCell(cell, randomThrow);
            player.setBoardCell(sum);
            displayDestinationCell(sum);

        }


    }
    }

