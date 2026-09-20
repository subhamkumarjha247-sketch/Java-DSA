package Java_05_Methods;

import java.util.Scanner;

public class permutation_and_combination_using_function {
    static int fact(int x) {
        int f=1;
        for (int i=1;i<=x;i++){
            f*=i;
        }
        return f;
    }

    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the value of N :");
        int n = sc.nextInt();
        System.out.print("Enter the value of R :");
        int r = sc.nextInt();

        int nCr = fact(n)/(fact(r)*fact(n-r));
        System.out.println(nCr);
        int nPr = fact(n)/fact(n-r);
        System.out.println(nPr);
    }
}
