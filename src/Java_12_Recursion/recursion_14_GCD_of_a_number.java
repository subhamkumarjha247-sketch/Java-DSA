package Java_12_Recursion;

import java.util.Scanner;

public class recursion_14_GCD_of_a_number {
    static int subh(int a,int b) {
        int hcf = 1;
        for (int i=2;i<Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }
        return hcf;
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a=sc.nextInt();
        System.out.print("Enter the value of b:");
        int b=sc.nextInt();
        System.out.println(subh(a,b));
    }

}
