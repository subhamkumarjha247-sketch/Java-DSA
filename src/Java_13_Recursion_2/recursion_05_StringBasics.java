package Java_13_Recursion_2;

import java.util.ArrayList;
import java.util.List;

public class recursion_05_StringBasics {
    static void main(String[] args) {
        String s="subham";
        change(s);
        System.out.println(s);

        String[] arr={"prem","aman","rudra","rishav"};
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        List<String> xy=new ArrayList<>();
        xy.add("sonu");
        xy.add("monu");
        xy.add("tonu");
        xy.add("ronu");
        System.out.println(xy);

        change2(xy);
        System.out.println(xy);
    }

    static void change(String s) {
        s="Golu";
    }

    static void change2(List<String> xy) {
        xy.add("gonu");
    }

}
