package Java_01_Basic_Cheeze;

import java.util.Scanner;

public class simple_interest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of Profit : ");
        double p = sc .nextDouble();

        System.out.print("Enter the value of Rate : ");
        double r = sc .nextDouble();

        System.out.print("Enter the value of Time : ");
        double t = sc .nextDouble();

        System.out.print("Simple interest is : \t");
        System.out.println((p*r*t)/100);
    }
}
