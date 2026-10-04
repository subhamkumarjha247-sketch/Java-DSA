package Java_12_Recursion;

import java.util.Scanner;

public class recursion_10_factorial_of_no {
    static int subh(int n) {
        if (n==0 || n==1)
            return 1;
        return n*subh(n-1);
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(subh(n));
    }
}
