package Java_04_Pattern_Printing;

import java.util.Scanner;

public class triangle_number_alphabet {
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
//                char x = 0;
//                int y = 0;
                if (i%2 == 0){
//                    x=(char)(j+64);
                    System.out.print((char)(j+64)+" ");
                }
//                System.out.print((char)(j+64)+" ");
                else {
//                    y=j;
                    System.out.print(j +" ");
                }
//                System.out.print(j);
            }
            System.out.println();
        }
    }
}
