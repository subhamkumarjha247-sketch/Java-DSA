package Java_04_Pattern_Printing;

import java.util.Scanner;

public class Triangle_vertically_flip {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if(i+j > n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
