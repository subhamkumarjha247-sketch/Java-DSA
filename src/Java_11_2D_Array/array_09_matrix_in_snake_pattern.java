package Java_11_2D_Array;

public class array_09_matrix_in_snake_pattern {
    static void main(String[] args) {
        int[][] arr= {{6,0,20,3,5},{5,1,60,2,3},{5,2,6,4,7}};
        for (int i=0;i<arr.length;i++){
            if(i%2 == 0){
                for (int j=0;j<arr[0].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int j=arr[0].length-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
