package Java_12_Recursion;

import java.util.Scanner;

public class recursion_12_power_of_no {
    static int subh(int a,int b) {
        if (b==0)
            return 1;
        return a*subh(a,b-1);
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a=sc.nextInt();
        System.out.println("Enter the value of b :");
        int b=sc.nextInt();
//        System.out.println(Math.pow(a,b));
        System.out.println(subh(a,b));
    }
}
