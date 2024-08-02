import java.util.HashMap;
import java.util.HashSet;

public class Q8 {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Integer>> rows = new HashMap<>();
        HashMap<Integer, HashSet<Integer>> cols = new HashMap<>();
        HashMap<Integer, HashSet<Integer>> boxes = new HashMap<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int num = board[i][j];
                if (num == '.') continue;

                int offset = i/3*3 + j/3;

                HashSet<Integer> row = rows.getOrDefault(i, new HashSet<>());
                if(row.contains(num)) return false;
                HashSet<Integer> col = cols.getOrDefault(j, new HashSet<>());
                if(col.contains(num)) return false;
                HashSet<Integer> box = boxes.getOrDefault(offset, new HashSet<>());
                if(box.contains(num)) return false;

                if(!rows.containsKey(i)) rows.put(i, row);
                row.add(num);
                if(!cols.containsKey(j)) cols.put(j, col);
                col.add(num);
                if(!boxes.containsKey(offset)) boxes.put(offset, box);
                box.add(num);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Q8 q8 = new Q8();

        char[][] board = new char[][]{{'1','2','.','.','3','.','.','.','.'},
                {'4','.','.','5','.','.','.','.','.'},
                {'.','9','1','.','.','.','.','.','3'},
                {'5','.','.','.','6','.','.','.','4'},
                {'.','.','.','8','.','3','.','.','5'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','.','.','.','.','.','2','.','.'},
                {'.','.','.','4','1','9','.','.','8'},
                {'.','.','.','.','8','.','.','7','9'}};

        System.out.println(q8.isValidSudoku(board));
    }
}