package Java_03_Loops;

import java.util.Scanner;

public class Que_one {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        if(n==0) {
            n=5;
        }
        int count = 0;
        while(n != 0){
            n /= 10;
            count++;
        }
        System.out.println(count);
    }
}
