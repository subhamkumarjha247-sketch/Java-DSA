package Java_06_Array;

import java.util.ArrayList;
import java.util.Collections;

public class Adding_one {
    static void main(String[] args) {
        int[] arr={9,9,9};
        ArrayList<Integer> arr_one=new ArrayList<>();
        int n=arr.length;
        int carry=1;
        for (int i=n-1;i>=0;i--){
            if(arr[i]+carry<=9){
                arr_one.add(arr[i]+carry);
                carry=0;
            }
            else {
                arr_one.add(0);
                carry=1;
            }
        }
        if(carry==1){
            arr_one.add(1);
        }
        Collections.reverse(arr_one);
        System.out.print(arr_one+"  ");
    }
}
