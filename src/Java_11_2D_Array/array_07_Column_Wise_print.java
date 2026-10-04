package Java_11_2D_Array;

public class array_07_Column_Wise_print {
    static void main(String[] args) {
        int[][] arr= {{6,0,20,3,5},{5,1,60,2,3},{5,2,6,4,7}};
        int maxSum=Integer.MIN_VALUE;
        for (int i=0;i<arr[0].length;i++){
            for (int j=0;j<arr.length;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
