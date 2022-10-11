package ss1_introduction.BaitTap;

import java.util.Scanner;

public class Currency_Conversion {
    public static void main( String [] args){
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập tiền USD");
        usd = sc.nextDouble();
        double doi = usd * vnd;
        System.out.println(" Tien sau khi chuyen doi "+doi);

    }



}
