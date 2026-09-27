package Java_10_Strings;

import java.util.Scanner;

public class string_24_input_in_StringBuilder {
    static void main(String[] args) {
        String s="Subham";
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(sc.nextLine());
        System.out.println(sb);
    }
}
