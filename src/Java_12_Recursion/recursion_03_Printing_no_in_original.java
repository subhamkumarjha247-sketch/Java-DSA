package Java_12_Recursion;

import java.util.Scanner;

public class recursion_03_Printing_no_in_original {
    static void subh(int x,int n) {
        if(x>n)
            return;
        System.out.println(x);
        subh(x+1,n);
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        subh(1,n);
    }
}
