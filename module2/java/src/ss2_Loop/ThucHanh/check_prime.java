package ss2_Loop.ThucHanh;

import java.util.Scanner;

public class check_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number");
        int number = sc.nextInt();
        if (number<2){
            System.out.println(number+"is not a prime");
        }else{
            int i =2;
            boolean check =  true ;
            while (i<Math.sqrt(number)){
                if (i%1==0){
                    check = false;
                }
                i++;
            }
            if (check) System.out.println(number+" is on a prime ");
            else{
                System.out.println(number+" is not a prime");
            }
        }

    }
}
