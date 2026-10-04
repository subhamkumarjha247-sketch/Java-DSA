package Java_12_Recursion;

import java.util.Scanner;

public class recursion_13_power_of_no_using_Binary_no {
    static int subh(int a,int b) {
        if(b==0)
            return 1;
        int val=subh(a,b/2);
        if (b/2==0)
            return val*val;
        else
            return a*val*val;
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a=sc.nextInt();
        System.out.println("Enter the value of b :");
        int b=sc.nextInt();

        System.out.println(subh(a,b));
    }
}
