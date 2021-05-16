//package nQueens;
//
//public class Queens {
//
//    private static int row;
//    private static int[][] chess;
//    private static int qsf;
//    private int n;
//    private int row;
//
//    public Queens(int n)
//        {
//            this.n = n;
//            this.chess = new int[n][n];
//            String qsf = "";
//            row = 0;
//
//        }
//
//    public static void printQueens(chess,qsf + row + " " + col)
//        {
//            if (row == chess.length) {
//                System.out.println(qsf);
//                return;
//            }
//
//            //check om man kan placere dronningen
//            for (int col = 0; col < chess.length; col++) {
//                if (isSafeToPlaceQueen(chess, row, col)) {
//                    chess[row][col] = 1;
//                    printQueens(chess, qsf + row + " " + col + ", ", row + 1);
//                    chess[row][col] = 0;
//                }
//            }
//        }
//
//    // metode for at se om vi kan få lov til at placere vores dronning i spillet.
//    public static boolean isSafeToPlaceQueen(int[][] chess, int row, int col)
//        {
//            //checker række på venstre side
//            for (int i = row - 1, j = col; i >= 0; i--) {
//                if (chess[i][j] == 1) {
//                    return false;
//                }
//            }
//            //checker øvre side til venstre
//            for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
//                if (chess[i][j] == 1) {
//                    return false;
//                }
//            }
//
//            for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
//                if (chess[i][j] == 1) {
//                    return false;
//                }
//            }
//            return true;
//        }
//}
