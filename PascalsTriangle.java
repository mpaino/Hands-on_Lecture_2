import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows){

        List<List<Integer>> triangle = new ArrayList<>();

        //generate triangle
        for(int i = 0; i < numRows; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
                //sets row ends to 1
                if (j == 0 || j == i) {
                    row.add(1);
                } else { //adds upper left and right values
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                }
            }
            triangle.add(row); //creates row
        }
        return triangle;
    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input number of rows: ");

        int rowNum = scanner.nextInt();
        System.out.println(generate(rowNum));
    }
}


