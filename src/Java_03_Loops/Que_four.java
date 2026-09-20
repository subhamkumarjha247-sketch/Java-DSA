package Java_03_Loops;


import java.util.Scanner;

public class Que_four {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = sc.nextInt();
        int initial = n;
        int r=0;
        while(n != 0){
            r *= 10;
            r += (n%10);
            n /= 10;
        }
        int sum = initial + r;
        System.out.println(initial);
        System.out.println("reverse" +" "+ r);
        System.out.println(sum);
    }
}
