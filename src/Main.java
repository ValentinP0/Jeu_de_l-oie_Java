public class Main {

    public static void main(String[] args) {

        Player one = new Player("Toto");
        boolean ongoing = true;
        int count = 0;
        Board gameBoard = new Board();

        while(ongoing) {

            Turn turn = new Turn(one);
            if (one.getBoardCell()==0){
                System.out.println("tour initial");
                turn.firstChangeCell();


            }
            else {
                turn.changeCell();
            }
                gameBoard.ShowCases();
                gameBoard.showPosition(one.getBoardCell());
            if(!turn.ongoing) {
                ongoing = false;
                System.out.println("You Won !");
            }
            count++;

        }
        System.out.println(count);

    }
}