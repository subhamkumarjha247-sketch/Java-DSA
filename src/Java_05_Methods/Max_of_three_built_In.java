package Java_05_Methods;
import java.util.Scanner;
public class Max_of_three_built_In {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(Math.max(Math.max(a,b),c));
    }
}
