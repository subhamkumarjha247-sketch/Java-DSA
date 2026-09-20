package Java_02_If_Else;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the value of Cost Price : ");
        double cp = sc.nextDouble();

        System.out.print("enter the value of Selling Price : ");
        double sp = sc.nextDouble();

        if(sp>cp){
//            System.out.println("Profit");
//            double Profit = sp-cp;
            System.out.println("Profit is :" +(sp-cp) );
        }
        if(cp>sp){
//            System.out.println("Loss");
//            double Loss = cp-sp;
            System.out.println("Loss is :" +(cp-sp));
        }
        if(cp==sp){
            System.out.println("Neither profit Nor loss :" );
        }
    }
}
