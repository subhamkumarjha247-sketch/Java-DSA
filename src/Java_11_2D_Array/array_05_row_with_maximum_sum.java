package Java_11_2D_Array;

public class array_05_row_with_maximum_sum {
    static void main(String[] args) {
       int[][] arr= {{6,0,20,3,5},{5,1,6,2,3},{5,2,6,4,7}};
       int maxSum =Integer.MIN_VALUE;
       int row=-1;
       for (int i=0;i<arr.length;i++){
           int sum =0;
           for (int j=0;j<arr[0].length;j++){
               sum+=arr[i][j];
           }
           if (sum>maxSum){
               maxSum=sum;
               row=i;
           }
       }
        System.out.println(row+" "+maxSum);

    }
}
