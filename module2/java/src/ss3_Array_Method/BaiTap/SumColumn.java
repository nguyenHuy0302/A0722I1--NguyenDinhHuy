package ss3_Array_Method.BaiTap;

import java.util.Scanner;

public class SumColumn {
    public static int sumOfColumn(int[][] array, int column){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                if(j==column) sum += array[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int column, row;
        System.out.print("Enter a row: ");
        row = scanner.nextInt();
        System.out.print("Enter a column: ");
        column = scanner.nextInt();
        int[][] arr = new int[row][column];
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print("Enter element arr[" + i + "," + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Sum of column (Enter column): ");
        int x = scanner.nextInt();
        System.out.println("Sum of column " + column + " = " + sumOfColumn(arr,x));
    }
}
