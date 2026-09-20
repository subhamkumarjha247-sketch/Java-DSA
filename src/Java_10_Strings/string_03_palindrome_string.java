package Java_10_Strings;

import java.util.Scanner;

public class string_03_palindrome_string {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int i=0,j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                System.out.println("False");
                return;
            }
            else{
                i++;
                j--;
            }
        }
        System.out.println("True");
    }
}
