package Java_01_Basic_Cheeze;

import java.util.Scanner;

public class module {
    public static void main(String[]arg){
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter the value of x : ");
         double x = sc .nextDouble();

         System.out.print("Enter the value of y : ");
         double y = sc .nextDouble();

         double z=x%y;

        System.out.println(z);
    }
}
