package Java_04_Pattern_Printing;

import java.util.Scanner;

public class special_pattern_one {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of N :");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i-1;j++){
                System.out.print("  ");
            }
            for (int k=1;k<=n+1-i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
