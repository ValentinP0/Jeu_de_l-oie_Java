public class Main {

    public static void main(String[] args) {

        Player one = new Player("Toto");
        boolean ongoing = true;
        int count = 0;
        Board gameBoard = new Board();

        while(ongoing) {
            count++;
            Turn turn = new Turn(one);
            turn.changeCell();
            gameBoard.ShowCases();
            gameBoard.showPosition(one.getBoardCell());
            if(!turn.ongoing) {
                ongoing = false;
                System.out.println("You Won !");
            }
        }
        System.out.println(count);

    }
}