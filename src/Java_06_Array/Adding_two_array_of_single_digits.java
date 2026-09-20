package Java_06_Array;

import java.util.ArrayList;
import java.util.Collections;

public class Adding_two_array_of_single_digits {
    static void main(String[] args) {
        int[] arr_one={7,3,9,4};
        int[] arr_two={6,2,8,5};
        int n=arr_one.length;
        ArrayList<Integer> arr=new ArrayList<>();
        int carry=0;
        for (int i=n-1;i>=0;i--){
            if (arr_one[i]+arr_two[i]<=9){
                arr.add(arr_one[i]+arr_two[i]+carry);
                carry=0;
            }
            else {
                arr.add((arr_one[i]+arr_two[i]+carry)%10);
                carry=1;
            }
        }
        if(carry==1){
            arr.add(1);
        }
        Collections.reverse(arr);
        System.out.print(arr+" ");
    }
}
