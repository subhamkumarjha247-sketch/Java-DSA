package Java_11_2D_Array;

import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public ArrayList<ArrayList<Integer>> generate(int n) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i=0;i<n;i++){
            arr.add(new ArrayList<>());
            for (int j=0;j<=i;j++){
                if(j==0 || j==i){
                    arr.get(i).add(1);
                }
                else {
                    int value=arr.get(i-1).get(j)+arr.get(i-1).get(j-1);
                    arr.get(i).add(value);
                }
            }
        }
        return arr;
    }
}




public class array_15_Pascal_triangle {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution obj=new Solution();
        ArrayList<ArrayList<Integer>> result=obj.generate(n);

        System.out.println(result);

    }
}
