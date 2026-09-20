package Java_05_Methods;

import java.util.Scanner;

public class Min_of_three_built_in {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(Math.min(Math.min(a,b),Math.min(c,d)));
    }
}
