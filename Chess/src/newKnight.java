import java.util.Arrays;
import java.util.Scanner;

public class newKnight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x = ");
        int x = scanner.nextInt();
        System.out.println();
        System.out.print("y = ");
        int y = scanner.nextInt();
        System.out.println();
        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < 8; i++) {
            Arrays.fill(chessBoard[i], "#");
        }
        chessBoard[x][y] = "K";

        for (int i = x - 2; i <= x + 2; i++) {
            for (int j = y - 2; j <= y + 2; j++) {
                if ((i == x || j == y || i < 0 || i > 7 || j < 0 || j > 7) || (Math.abs((x+y) - (i + j)) != 3 && Math.abs((x+y) - (i + j)) != 1)) {
                    continue;
                } else chessBoard[i][j] = "O";
            }
        }
        for (int i = 0; i < 8; i++) {
            System.out.println(Arrays.toString(chessBoard[i]));

        }
    }


}
