package Java_04_Pattern_Printing;

import java.util.Scanner;

public class hollow_rectangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of : M ");
        int m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for(int j=1; j<=m; j++){
                if(i == 1 || j == 1 || i == n || j == m){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
//            if(i>1&&i<n){
//                for (int j = 1; j <= n; j++) {
//                    System.out.print("*" + " ");
//                }
//            }
//            else{
//                for(int k=1; k<=n;k++){
//                    if(k<2&&k>n-1){
//                        System.out.print("*"+" ");
//                    }
//                    else{
//                        System.out.print(" ");
//                    }
//                }
//            }
//            System.out.println();
//        }
    }
}
//        int i = 0;
//        if(i>1 && i<n) {
//            for(i=1;i<=n;i++){
//              for(int j=1;j<=n;j++){
//                    if(j>1 &&  j<n){
//                        System.out.print("");
//                    }
//                    else{
//                        System.out.print("*");
//                    }
//              }
//            }
//        }
//        else{
//            for (i=1;i<=n;i++) {
//                System.out.print("*" + " ");
//            }
//        }
//        System.out.println();
//    }
//}
