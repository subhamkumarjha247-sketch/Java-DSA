package Java_02_If_Else;

import java.util.Scanner;

public class GreaterOfThree_by_TernaryOperator {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the value of X : ");
        int x = sc.nextInt();
        System.out.print("Enter the value of Y : ");
        int y = sc.nextInt();
        System.out.print("Enter the value of Z : ");
        int z = sc.nextInt();

        System.out.println((x>y)? ((x>z)? "x"+ " " +(x) : "z"+ " " +(z)) : ((y>z)? "y"+ " " +(y) : "z"+ " " +(z)));

    }
}
