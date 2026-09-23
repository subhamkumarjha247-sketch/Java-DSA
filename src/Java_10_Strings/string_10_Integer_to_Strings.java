package Java_10_Strings;

import java.util.Scanner;

public class string_10_Integer_to_Strings {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

//        String s="";    //empty string
//        s +=n;
        String s=Integer.toString(n);
        System.out.println(s);
    }
}
