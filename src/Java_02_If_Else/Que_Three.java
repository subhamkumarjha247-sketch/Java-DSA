package Java_02_If_Else;

import java.util.Scanner;

public class Que_Three {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Number :");
        double n = sc.nextDouble();

        if(n%3 == 0 && n%5 == 0){
            System.out.println("Subham");
        }
        else if(n%3 == 0){
            System.out.println("Golu");
        }
        else if(n%5 ==0) {
            System.out.println("Saurav");
        }
        else{
            System.out.println("Ankush");
        }
    }
}
