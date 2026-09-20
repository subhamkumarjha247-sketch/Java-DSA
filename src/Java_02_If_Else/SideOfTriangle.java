package Java_02_If_Else;

import java.util.Scanner;

public class SideOfTriangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sides are :");
        int x = sc.nextInt();

        System.out.println("Sides are :");
        int y = sc.nextInt();

        System.out.println("Sides are :");
        int z = sc.nextInt();

        if((x+y)>z && (y+z)>x && (z+x)>y)
            System.out.println("Is a Triangle");
        else
            System.out.println("Not a Triangle");
    }
}
