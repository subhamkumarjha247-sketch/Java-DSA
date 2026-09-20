package Java_03_Loops;

import java.util.Scanner;

public class Table {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of table:");
        int n = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.print(n * i +" ");
        }
    }
}
