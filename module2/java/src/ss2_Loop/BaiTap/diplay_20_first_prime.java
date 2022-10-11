package ss2_Loop.BaiTap;

import javax.swing.*;

public class diplay_20_first_prime {
      static boolean checkPrime(int x){
          for (int i =2 ; i<=Math.sqrt(x); i++){
              if (x%i==0) return false;
          }
          return true;
      }
//      if(x<2){
//          return false;
//        System.out.print("ko phai so nguyen to");
//    }
//      int squareRoot = (int)Math.sqrt(x);
//      for(int i = 2; i<= squareRoot ;i++){
//          if (i%2==0) {  return false;
//          }
//          return true;
//    }
    public static void main(String[] args) {
        int i =1;
        int dem =0;
        while (dem<=20){
            if (checkPrime(i)){
                dem++;
                System.out.print(i+ " ");
            }
            i++;
        }
    }
}

