package Java_01_Basic_Cheeze;

import java.util.Scanner;

public class sum_of_num {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter frist num : ");
        double x = sc .nextDouble();

        System.out.print("enter second num : ");
        double y = sc .nextDouble();

        System.out.print("enter third num : ");
        double z = sc .nextDouble();

        System.out.print("Sum is :\t");
        System.out.println(x+y+z);
    }
}
