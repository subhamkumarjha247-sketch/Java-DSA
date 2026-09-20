package Java_02_If_Else;

import java.util.Scanner;

public class Ternary_Basic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the value of X : ");
        int x = sc .nextInt();

        System.out.println((x%2==0) ? "Even" : "Odd");
    }
}
