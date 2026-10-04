package Java_11_2D_Array;

import java.util.ArrayList;

public class array_14_arrayList {
    static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(10);a.add(20);a.add(15);

        ArrayList<Integer> b=new ArrayList<>();
        b.add(3);b.add(1);b.add(9);b.add(4);

        ArrayList<Integer> c=new ArrayList<>();
        c.add(21);c.add(23);

        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);

        System.out.println(arr);
        System.out.println();

        arr.add(new ArrayList<>());
        arr.get(arr.size()-1).add(10);
        arr.get(arr.size()-1).add(20);

        for (int i=0;i<arr.size();i++){
            for (int j=0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
        System.out.println();

            //  WITH THE HELP OF  FOR EACH  LOOP
        for (ArrayList<Integer> xyz:arr){
            for (int ele:xyz){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
