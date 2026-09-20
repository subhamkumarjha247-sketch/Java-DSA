package Java_03_Loops;

import java.util.Scanner;

public class Input_User_one_to_ten {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       System.out.print("enter the number : ");
       int n = sc.nextInt();

       for(int i=1; i<=n; i++){
           System.out.print(i + " ");
       }
    }
}
