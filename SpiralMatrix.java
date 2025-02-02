import java.util.ArrayList;
import java.util.List;
public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int rowStart = 0, rowEnd = matrix.length - 1;
        int colStart = 0, colEnd = matrix[0].length - 1;

        //traverse matrix from left to right
        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = colStart; i <= colEnd; i++) {
                result.add(matrix[rowStart][i]);
            }
            rowStart++;
        //traverse right-most column up and down
            for (int i = rowStart; i <= rowEnd; i++) {
                result.add(matrix[i][colEnd]);
            }
            colEnd--;
        //traverse bottom row from right to left
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    result.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;
        //traverse left-most column down to center row
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    result.add(matrix[i][colStart]);
                }
            }
            colStart++;
        }
        return result;
    }
    public static void main (String[] args){
        //replace with test cases
        int[][] matrix = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12}};

        System.out.println(spiralOrder(matrix));

    }
}

