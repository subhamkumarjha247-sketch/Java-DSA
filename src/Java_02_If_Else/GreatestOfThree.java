package Java_02_If_Else;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x :  ");
        int x = sc.nextInt();

        System.out.println("Enter value of y : ");
        int y = sc.nextInt();

        System.out.println("Enter value of z : ");
        int z = sc.nextInt();
        if(x>=y && y>=z)
            System.out.println(x);
        else if (y>=x && x>=z)
            System.out.println(y);
        else
            System.out.println(z);

    }
}
