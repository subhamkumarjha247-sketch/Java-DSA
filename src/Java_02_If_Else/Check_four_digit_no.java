package Java_02_If_Else;

import java.util.Scanner;

public class Check_four_digit_no {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No. : ");
        int n = sc.nextInt();

        if(n>999 && n<10000){
            System.out.println("Four digit number");
        }
        else{
            System.out.println("Not four digit number");
        }
    }
}
