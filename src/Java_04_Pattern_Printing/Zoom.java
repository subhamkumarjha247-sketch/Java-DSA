package Java_04_Pattern_Printing;
import java.util.Scanner;
public class Zoom {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        for (int i=1;i<=2*n-1;i++){
            for (int j=1;j<=2*n-1;j++){
//                method 1
//                if(i<j){
//                    System.out.print(i+" ");
//                }
//                else{
//                    System.out.print(j+" ");
//                }

//                method 2
                int a=i, b=j;
                if (i>n){
                    a = 2*n-i;
                }
                if (j>n){
                    b = 2*n-j;
                }
                System.out.print(Math.min(a,b)+" ");
            }
            System.out.println();
        }
    }
}
