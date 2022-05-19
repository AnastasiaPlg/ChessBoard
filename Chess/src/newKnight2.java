import java.util.Arrays;
import java.util.Scanner;

public class newKnight2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x = ");
        int x = scanner.nextInt();
        System.out.println();
        System.out.print("y = ");
        int y = scanner.nextInt();
        System.out.println();

        String[][] bigBoard = new String[12][12];
        for (int i = 0; i < 12; i++) {
            Arrays.fill(bigBoard[i], "#");
        }
        int x1 = x + 2;
        int y1 = y + 2;
        bigBoard[x1][y1] = "K";
        bigBoard[x1 - 2][y1 - 1] = "O";
        bigBoard[x1 - 1][y1 - 2] = "O";
        bigBoard[x1 + 1][y1 - 2] = "O";
        bigBoard[x1 + 2][y1 - 1] = "O";
        bigBoard[x1 - 2][y1 + 1] = "O";
        bigBoard[x1 - 1][y1 + 2] = "O";
        bigBoard[x1 + 1][y1 + 2] = "O";
        bigBoard[x1 + 2][y1 + 1] = "O";
        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < 8; i++) {
           chessBoard[i] = Arrays.copyOfRange(bigBoard[i+2], 2, 10);
        }
        for (int i = 0; i < 8; i++) {
            System.out.println(Arrays.toString(chessBoard[i]));
        }
    }
}
