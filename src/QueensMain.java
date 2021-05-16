import java.util.Scanner;

public class QueensMain {
 // har kørt det hele i main for Queens. Har lavet en scanner så man selv kan vælge felt.
    //håber i synes det giver mening.. og at en af jer vil lære mig at spille skak en dag :)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] chess = new int[n][n];
        printQueens(chess, "", 0);
    }

    public static void printQueens(int[][] chess, String qsf, int row) {
        if (row == chess.length) {
            System.out.println(qsf);
            return;
        }

        //i er column
        for (int col = 0; col < chess.length; col++) {
            if (isSafeToPlaceQueen(chess, row, col) == true) {
                chess[row][col] = 1;
                printQueens(chess, qsf + row + "-" + col + ",", row + 1);
                chess[row][col] = 0;
            }
        }
    }

        // har lavet denne metode for at se om vi kan få lov til at placere vores dronning i spillet.
    //er ikke 100% sikker på at jeg forstod opgaven, især fordi jeg aldrig spille skak. Så i må gerne lige
    //tjekke om i synes det giver mening :)
    public static boolean isSafeToPlaceQueen(int[][] chess, int row, int col){
        //checker række på venstre side
        for(int i = row -1, j = col; i >= 0; i--){
        if(chess[i][j] == 1){
            return false;
        }
        }
        //checker øvre side til venstre
        for(int i = row -1, j= col -1; i >= 0 && j >= 0; i--, j--){
            if(chess[i][j] == 1){
                return false;
            }
        }
        
        for(int i = row -1, j= col + 1; i >= 0 && j < chess.length; i--, j++){
            if(chess[i][j] == 1){
                return false;
            }
        }
        return true;
    }

}
