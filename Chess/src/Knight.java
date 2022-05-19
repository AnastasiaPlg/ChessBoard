import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Knight {
    public static void main(String[] args) {
        int[][] chessBoard = new int[8][8];
        String letters = "ABCDEFGH";
        String position = "";

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter knight position (for example C1): ");
            position = scanner.nextLine();
            if (letters.contains(position.charAt(0) + "") && (position.charAt(1) >= 49 && position.charAt(1) <= 57)) {
                break;
            } else System.out.println("Error! Try again!");
        }

        int x = 0;
        int y = 0;

        for (int i = 0; i < 8; i++) {
            if (position.charAt(0) == letters.charAt(i)) {
                x = i;
                for (int j = 0; j < 8; j++) {
                    if (position.charAt(1) == (j + 49)) {
                        y = j;
                    }
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            if (i == 2 || x - 2 + i < 0 || x - 2 + i > 7) {
                continue;
            }
            for (int j = 0; j < 5; j++) {
                if (j == 2 || y - 2 + j < 0 || y - 2 + j > 7) {
                    continue;
                }
                if ((i % 2 == 1 && j % 2 == 0) || (i % 2 == 0 && j % 2 == 1)) {
                    chessBoard[x - 2 + i][y - 2 + j] = 1;
                }
            }
        }
        ArrayList<String> moves = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (chessBoard[i][j] == 1) {
                    moves.add("" + letters.charAt(i) + (j + 1));
                }
            }
        }
        System.out.println("There are " + moves.size() + " possibilities of knight moving. They are: " + moves.toString());
    }

}
