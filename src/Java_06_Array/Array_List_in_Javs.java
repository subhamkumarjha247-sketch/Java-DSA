package Java_06_Array;

import java.util.ArrayList;
import java.util.Collections;

public class Array_List_in_Javs {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(31);
        arr.add(9);
        arr.add(15);

        System.out.println(arr.get(2));  //  arr[2]

        arr.set(3,50);     //  arr[3]=50

        System.out.println(arr);      //

//                    OR

        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }

//                     OR
        System.out.println();

        arr.add(2,100);

        arr.remove(arr.size()-1);

        for (int ele:arr){
            System.out.print(ele+" ");
        }

        System.out.println();
        int i=0,j=arr.size()-1;
        while(i<j) {
            int temp=arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        System.out.print(arr+" ");

//              OR

        Collections.reverse(arr);
        System.out.print(arr+" ");


    }
}
