package Java_05_Methods;

import java.util.Scanner;

public class permutation_and_combination_using_loop {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N :");
        int n = sc.nextInt();
        System.out.print("Enter the value of R :");
        int r = sc.nextInt();
        int nfact = 1;
        for (int i=1;i<=n;i++){
            nfact *= i;
        }
//        System.out.println(nfact);
        int rfact = 1;
        for (int j=1;j<=r;j++){
            rfact *= j;
        }
        int nrfact = 1;
        for (int k = 1; k <=n-r; k++){
            nrfact *= k;
        }
        int ncr = nfact/(rfact*nrfact);
        System.out.println(ncr);
    }
}
