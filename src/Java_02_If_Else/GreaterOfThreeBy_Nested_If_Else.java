package Java_02_If_Else;

import java.util.Scanner;

public class GreaterOfThreeBy_Nested_If_Else {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the value of X : ");
        int x = sc.nextInt();
        System.out.print("Enter the value of Y : ");
        int y = sc.nextInt();
        System.out.println("Enter the value of Z : ");
        int z = sc.nextInt();

        if(x>=y){
            if(x>=z) System.out.println(x);
            else System.out.println(z);
        }
        else{
            if(y>=z) System.out.println(y);
            else System.out.println(z);
        }

    }
}
