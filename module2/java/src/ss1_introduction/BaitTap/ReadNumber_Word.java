package ss1_introduction.BaitTap;

import java.util.Scanner;

public class ReadNumber_Word {
    final static String[] ONES = {""," one"," two"," three"," four"," five", " six", " seven"
            ," eight", " nine"," ten"," eleven", " twelve"," thirteen", " fourteen", " sixteen"
            ," seventeen"," eighteen"," nineteen"};
    public static String[] TENS = {" "," "," twenty"," thirty"," forty", " fifty"," sixty"," seventy"
            ," eighty", " ninety"};

    public static void docSo(int num, String value){
        System.out.println(num>19?TENS[num/10]+" "+ONES[num%10]:ONES[num]);
        System.out.println(num>0?value:"");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        docSo(((num/10)%10)," hundred and" );
        docSo(num%10,"");
    }
}

