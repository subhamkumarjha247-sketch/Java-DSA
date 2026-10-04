package Java_12_Recursion;

import java.util.Scanner;

public class recursion_02_Printing_no_in_reverse_order {
    static void subh(int n) {
        if (n==0)
            return;
        System.out.println(n);
        subh(n-1);
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        subh(n);
    }
}
