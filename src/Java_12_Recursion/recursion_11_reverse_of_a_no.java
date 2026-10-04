package Java_12_Recursion;

import java.util.Scanner;

public class recursion_11_reverse_of_a_no {
    static int subh(int n,int r) {
        if (n==0)
            return r;
        return subh(n/10,r*10+n%10);

    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(subh(n,0));
    }
}
