package ss3_Array_Method.BaiTap;

import java.util.Scanner;

import static ss3_Array_Method.BaiTap.TongDuongCheo.sumOfDiagonalLine;

public class DemSoLanXuatHienCuaKiTu {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size: ");
        size = scanner.nextInt();
        int[][] arr = new int[size][size];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print("Enter element [" + i + "," + j +"]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Sum of diagonal line: " + sumOfDiagonalLine(arr));
    }
}
