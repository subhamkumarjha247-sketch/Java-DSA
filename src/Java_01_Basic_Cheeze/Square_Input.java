package Java_01_Basic_Cheeze;

import java.util.Scanner;

public class Square_Input {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side :\t");
        double r = sc .nextDouble();
        double x = r * r;
        System.out.print("Square is :\t");
        System.out.println(x);
    }
}
