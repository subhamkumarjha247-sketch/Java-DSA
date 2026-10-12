package Java_12_Recursion;

import java.util.Scanner;

public class recursion_17_nth_stairs {
    public static int subh(int n){
        if (n==1)
            return 1;
        if (n==2)
            return 2;
        return subh(n-1)+subh(n-2);
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(subh(n));
    }
}
