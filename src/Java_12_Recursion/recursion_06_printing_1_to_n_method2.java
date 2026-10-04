package Java_12_Recursion;

import java.util.Scanner;

public class recursion_06_printing_1_to_n_method2 {
    static int n;
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        subh(1);
    }

    static void subh(int x) {
        if(x>n)
            return;
        System.out.println(x);
        subh(x+1);
    }
}
