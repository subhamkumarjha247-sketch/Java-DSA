package Java_02_If_Else;

import java.util.Scanner;

public class HW_one {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length : ");
        int l = sc.nextInt();

        System.out.print("Enter breath : ");
        int b = sc.nextInt();

        int p = 2*(l+b);
        System.out.println("Parameter of Rectangle is : "+(p));

        int a = l*b;
        System.out.println("Area of Rectangle is : " +(a));

        if(p>a)
            System.out.println("Parameter is large");
        else
            System.out.println("Area is large");
    }
}
