package Java_04_Pattern_Printing;

import java.util.Scanner;

public class Diamond_method_two {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        int nsp=n-1, nst=1;
        for (int i=1;i<=n;i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= nst; k++) {
                System.out.print("* ");
            }
            nsp=nsp-1;
            nst=nst+2;
            System.out.println();
        }
        int sp=1, st=2*n-3;
        for (int p=1;p<=n-1;p++){
            for (int q=1;q<=sp;q++){
                System.out.print("  ");
            }
            for (int r=1;r<=st;r++){
                System.out.print("* ");
            }
            sp=sp+1;
            st=st-2;
            System.out.println();
        }
    }
}
