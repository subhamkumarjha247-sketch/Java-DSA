package Java_04_Pattern_Printing;

import java.util.Scanner;

public class captial_triangle_horizontal_flip {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }
    }
}
