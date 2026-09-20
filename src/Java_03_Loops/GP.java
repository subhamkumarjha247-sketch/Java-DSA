package Java_03_Loops;
import java.util.Scanner;
public class GP {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n;
        n=sc.nextInt();
        int a=1, r=2;
        for (int i=1; i<=n; i++){
            System.out.print(a + " ");
            a*=r;
        }


    }
}
