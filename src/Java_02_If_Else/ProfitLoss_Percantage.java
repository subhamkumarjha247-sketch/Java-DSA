package Java_02_If_Else;

import java.util.Scanner;
public class ProfitLoss_Percantage {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of cost price : ");
        double cp = sc.nextDouble();

        System.out.println("Enter the value of selling price : ");
        double sp = sc.nextDouble();

//        if(sp>cp){
//            System.out.println("Profit and it's percentage is: " +(((sp-cp)/cp)*100));
//        }
//        if(cp>sp){
//            System.out.println("Profit and it's percentage is: " +(((cp-sp)/cp)*100));
//        }
//        if(cp==sp) {
//            System.out.println("Neither profit Nor loss :");
        if(sp>cp){
            System.out.println("Profit and it's percentage is: " +(((sp-cp)/cp)*100));
        }
        else if(cp>sp){
            System.out.println("Profit and it's percentage is: " +(((cp-sp)/cp)*100));
        }
        if(cp==sp) {
            System.out.println("Neither profit Nor loss :");

        }
    }
}
