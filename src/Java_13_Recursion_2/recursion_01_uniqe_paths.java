package Java_13_Recursion_2;

import java.util.Scanner;

public class recursion_01_uniqe_paths {
//    static int subh(int m, int n) {
//        if (m==1)
//            return 1;
//        if (n==1)
//            return 1;
//        return subh(m-1,n)+subh(m,n-1);
//    }


    //      METHOD 2

    static int subh(int fr,int fc,int lr,int lc) {
        if (fr==lr && fc==lc){
            return 1;
        }
        if (fr>lr || fc>lc){
            return 0;
        }
        int right = subh(fr,fc+1,lr,lc);
        int down = subh(fr+1,fc,lr,lc);
        return right+down;

    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a=sc.nextInt();
        System.out.print("Enter the value of b:");
        int b=sc.nextInt();
        System.out.println(subh(0,0,a-1,b-1));
    }
}
