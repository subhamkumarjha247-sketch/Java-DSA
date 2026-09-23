package Java_10_Strings;

import java.util.Scanner;

public class string_07_change_in_string {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(Character.isUpperCase(str.charAt(0))){
            System.out.println(str.toUpperCase());
        }
        else {
            System.out.println(str.toLowerCase());
        }
    }
}
