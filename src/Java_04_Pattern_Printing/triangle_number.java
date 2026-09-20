package Java_04_Pattern_Printing;

import java.util.Scanner;

public class triangle_number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of N : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
