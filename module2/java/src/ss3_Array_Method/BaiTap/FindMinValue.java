package ss3_Array_Method.BaiTap;

import java.util.Scanner;

public class FindMinValue {
    public static int minvValue(int[] array){
        int min = array[0];
        for(int i=1; i<array.length; i++){
            if(array[i]<min) min = array[i];
        }
        return min;
    }
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size: ");
        size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter a element " +(i+1)+": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Min value: " + minvValue(arr));
    }
    }
