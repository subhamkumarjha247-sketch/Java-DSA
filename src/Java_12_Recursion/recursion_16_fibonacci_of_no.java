package Java_12_Recursion;

import java.util.Scanner;

public class recursion_16_fibonacci_of_no {
    static int subh(int n) {
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        return subh(n-1)+subh(n-2);
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        System.out.println(subh(n));
    }
}
