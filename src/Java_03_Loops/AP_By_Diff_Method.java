package Java_03_Loops;

import java.util.Scanner;

public class AP_By_Diff_Method {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();

        int a=2, d=3;
        for (int i=1; i<=n; i++){
            System.out.print(a +" ");
            a+=d;
        }
    }
}
