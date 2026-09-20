package Java_02_If_Else;

import java.util.Scanner;

public class Magnitude_smaller_then_no {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no : ");
        int n = sc.nextInt();

        if(n>-69 && n<69){
            System.out.println("Smaller than 69");
        }
        else{
            System.out.println("greater than 69");
        }
    }
}
