package ss2_Loop.BaiTap;

public class display_prime_small_100 {
    static private Boolean checkPrime(int x){
        for (int i =2 ; i<=Math.sqrt(x) ; i++){
            if (x%i ==0 ) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int i =2;
        while (i<100){
            if (checkPrime(i)){
                System.out.print(i+ " ");
            }
            i++;
        }
    }
}
