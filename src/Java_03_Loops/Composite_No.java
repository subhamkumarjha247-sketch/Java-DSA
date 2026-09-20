package Java_03_Loops;

import java.util.Scanner;
public class Composite_No {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N :");
        int n = sc.nextInt();
        for (int i=2; i<n-1; i++){
            if(n%i==0){
                System.out.print("Composite number");
                break;
            }
            else {
                System.out.print("Prime No");
                break;
            }
        }

    }
}
