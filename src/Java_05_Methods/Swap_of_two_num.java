package Java_05_Methods;

import java.util.Scanner;

public class Swap_of_two_num {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.print("value of X and Y before swaping : ");
        System.out.println(x+" "+y);
        int temp = x;
        x = y;
        y = temp;
        System.out.print("value of X and Y after swaping : ");
        System.out.println(x+" "+y);
    }
}
