package Java_03_Loops;

import java.util.Scanner;

public class Composite_no_by_boolean_function {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        boolean flag = true;
        for(int i=2; i<=Math.sqrt(n);i++)
        {
            if(n%i==0){
                flag =false;
                break;
            }
        }
        if(n==1)
            System.out.println("neither prime nor composite");
        else if (flag==false) {
            System.out.println("composite no");
        }
        else
            System.out.println("prime no");
    }

}
