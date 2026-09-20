package Java_02_If_Else;

import java.util.Scanner;

public class Divisible_By_5_or_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no : ");
        int n = sc.nextInt();

        if(n%3 == 0 ||  n%5==0)
            System.out.println("Divide by either 3 or 5");
        else
            System.out.println("NOT Divide by either 3 or 5");
    }
}
