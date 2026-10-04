package Java_12_Recursion;

import java.util.Scanner;

public class recursion_08_printing_n_to_1 {
    static void print(int n) {
        if (n==0)
            return;
        System.out.println(n);
        print(n-1);
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n);
    }
}
