package Java_02_If_Else;

import java.util.Scanner;
public class Divisible_By_Five {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of X :  ");
        int x = sc .nextInt();

        if (x%5==0) {
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}
