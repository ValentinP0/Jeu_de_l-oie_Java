public class Board {
    public final int lastCell = 63;

    public void showPosition(int index, char symbol){
        for (int j=0;j<index;j++){
            if(j<10) {
                System.out.print("  ");
            } else {
                System.out.print("   ");
            }
        }
        System.out.println(symbol);
    }
    public void ShowCases(){
        for (int i=0; i <= lastCell; i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}