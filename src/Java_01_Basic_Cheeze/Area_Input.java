package Java_01_Basic_Cheeze;
import java.util.Scanner;
public class Area_Input {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter radius:");
        double r = sc .nextDouble();
        double x= 3.14 * r * r;
        System.out.print("area is:");
        System.out.println(x);

    }
}
  