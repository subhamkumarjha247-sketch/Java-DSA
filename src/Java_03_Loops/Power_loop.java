package Java_03_Loops;

import java.util.Scanner;

public class Power_loop {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("enter the value of b : ");
        int b = sc.nextInt();
        int pow = 1;
        for(int i=1; i<=b; i++){
            pow *= a;
        }
        System.out.println("a raised to the power of b"+ " "+ pow);
    }
}
