import java.util.ArrayList;
import java.util.Arrays;

public class Queen {

        public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        ArrayList<String> list = new ArrayList<>();
        String queen = "Q";
        int x = 0;
        int y = 0;

        while (true) {
            int count = 0;
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    chessBoard[i][j] = "#";
                }
            }
            while (true) {
                while (true) {
                    x = (int) (8 * Math.random());
                    y = (int) (8 * Math.random());
                    if (chessBoard[x][y].equals("#")) {
                        chessBoard[x][y] = queen;
                        count++;
                        break;
                    }
                }
                fillBoard(chessBoard, queen, x, y);
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        list.add(chessBoard[i][j]);
                    }
                }
                if(list.contains("#")){
                    list.clear();
                } else break;
            }
            if (count == 8) {
                break;
            }
        }
            for (int i = 0; i < 8; i++) {
                System.out.println(Arrays.toString(chessBoard[i]));
            }
    }
    public static void fillBoard(String[][] array, String queen, int x, int y) {
        int a = array.length;
        int b = array[0].length;
        for (int i = 0; i < b; i++) {
            if (array[x][i].equals(queen)) {
                continue;
            }
            array[x][i] = "X";
        }
        for (int i = 0; i < a; i++) {
            if (array[i][y].equals(queen)) {
                continue;
            }
            array[i][y] = "X";
        }
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                if (array[i][j].equals(queen)) {
                    continue;
                }
                if (((i + j) == (x + y)) || ((i - j) == (x - y))) {
                    array[i][j] = "X";
                }
            }
        }
    }
}
