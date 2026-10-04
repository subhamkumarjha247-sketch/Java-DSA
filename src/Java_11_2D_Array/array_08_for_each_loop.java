package Java_11_2D_Array;

public class array_08_for_each_loop {
    static void main(String[] args) {
        int[][] arr= {{6,0,20,3,5},{5,1,60,2,3},{5,2,6,4,7}};
        for(int[] a : arr){
            for (int ele : a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
