package Java_12_Recursion;

import java.util.Scanner;

public class recursion_09_decreasing_increasing_no {
    static void subh(int n) {
        if (n==0)
            return;
        System.out.print(n+" ");
        subh(n-1);
        if(n!=1)
           System.out.print(n+" ");
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        subh(n);
    }
}
