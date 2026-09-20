package Java_02_If_Else;

import java.util.Scanner;

public class Que_One {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter the value of X : ");
        int x = sc .nextInt();

//        if(x>0){
//            System.out.print(x);
//        }
//        else{
//            System.out.print(-x);
//        }

//        OR
        if(x<0){
            x = -x;
        }
        System.out.println(x);
    }
}
