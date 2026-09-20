package Java_04_Pattern_Printing;

import java.util.Scanner;

public class special_pattern_two {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of N :");
        int n=sc.nextInt();
        int i=n;
        for (;i>=1;){
            for (int j=1;j<=(2*n+1)-2*i;j++){
                System.out.print("* ");
            }
            i=i-1;
            System.out.println();
        }
    }
}
