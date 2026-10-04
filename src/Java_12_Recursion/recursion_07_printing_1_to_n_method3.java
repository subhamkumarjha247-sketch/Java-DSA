package Java_12_Recursion;

import java.util.Scanner;

public class recursion_07_printing_1_to_n_method3 {
    static void subh(int n) {
        if(n==0)
            return;
        subh(n-1);
        System.out.print(n+" ");
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        subh(n);
    }

}
