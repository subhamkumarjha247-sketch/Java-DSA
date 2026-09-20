package Java_03_Loops;

import java.util.Scanner;

public class factorial_of_num {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n : ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact *= i;
            System.out.println(fact);
        }
        System.out.println(fact);
    }
}
