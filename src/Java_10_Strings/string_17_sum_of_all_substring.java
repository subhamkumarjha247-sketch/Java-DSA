package Java_10_Strings;

import java.util.Scanner;

public class string_17_sum_of_all_substring {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for (int j=0;j<s.length();j++) {
            for (int i = j+1; i <= s.length(); i++) {
                System.out.print(s.substring(j, i) + " ");
                count+=Integer.parseInt(s.substring(j,i));
            }
        }
        System.out.println("\nSum is"+count);
    }
}
