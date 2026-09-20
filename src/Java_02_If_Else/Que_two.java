package Java_02_If_Else;

import java.util.Scanner;

public class Que_two {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of X : ");
        double x = sc.nextDouble();

//        if(x%1==0){
//            System.out.print("Integer");
//        }
//        else{
//            System.out.print("Not Integer");
//        }

//         OR  (BY SIR)

//          double y=(int)x;
//          if(x-y==0){
//              System.out.println("Integer");
//          }
//          else{
//              System.out.println("Not Integer");
//          }

//           OR (BY SIR)

//        if(x - (int) x == 0){
//            System.out.println("Interger");
//          }
//        else{
//              System.out.println("Not Integer");
//          }

        if(x == (int) x ){
            System.out.println("Interger");
        }
        else{
            System.out.println("Not Integer");
        }
    }
}
