package Java_12_Recursion;

import java.util.Scanner;

public class recursion_15_GCD_of_a__no_using_RECURSION {
    static int subh(int a,int b) {
        if (a==0)
            return b;
        return subh(a%b,a);
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a=sc.nextInt();
        System.out.print("Enter the value of b:");
        int b=sc.nextInt();
        System.out.println(subh(a,b));
    }
}
