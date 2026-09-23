package Java_10_Strings;

import java.util.Scanner;

public class string_12_decimal_value_in_string {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
//        String s=""+n;
//        System.out.println(s.length());

        String s="Subham";
        s+=n;
        System.out.println(s);
    }
}
