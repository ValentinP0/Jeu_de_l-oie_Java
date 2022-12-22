import java.util.ArrayList;

public class Board {

    public ArrayList<Integer> positions;
    public final int end=63;
    // list of different special cases


    public ArrayList<Integer> getPositions() {
        return positions;
    }

    public void showPosition(int index){
        for (int j=0;j<index;j++){
            if(j<10) {
                System.out.print("  ");
            } else {
                System.out.print("   ");
            }
        }
        System.out.print("X");


    }
    public void ShowCases(){
        for (int i=0;i<64;i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
