package Java_02_If_Else;

import java.util.Scanner;

public class Check_Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the value of X :");
        int x = sc .nextInt();

        if(x%2==0) {
            System.out.println("Even Number");
        }
            else{
            System.out.print("Odd number");
        }
    }

}
