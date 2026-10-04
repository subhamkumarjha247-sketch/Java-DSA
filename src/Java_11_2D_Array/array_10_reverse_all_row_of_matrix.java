package Java_11_2D_Array;

public class array_10_reverse_all_row_of_matrix {
    static void main(String[] args) {
        int[][] arr= {{6,0,20,3,5},{5,1,60,2,3},{5,2,6,4,7}};
        for(int i=arr.length-1;i>=0;i--){
            for (int j=arr[0].length-1;j>=0;j--){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
