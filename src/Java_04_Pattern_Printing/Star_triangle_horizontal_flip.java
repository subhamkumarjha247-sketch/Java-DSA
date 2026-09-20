package Java_04_Pattern_Printing;

import java.util.Scanner;

public class Star_triangle_horizontal_flip {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
//        for(int i=n; i>=1; i--){
//            for (int j=1; j<=i; j++){
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }

//        method two

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n+1-i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
    }
//        method three
//        int a = n;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=a;j++){
//                System.out.print("*"+" ");
//            }
//            a--;
//            System.out.println();
//        }
    }
}
