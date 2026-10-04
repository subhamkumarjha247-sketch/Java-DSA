package Java_11_2D_Array;

public class array_11_snake_pattern_in_column_wise {
    static void main(String[] args) {
        int[][] arr= {{6,0,20,3,5},{5,1,60,2,3},{5,2,6,4,7}};
        for(int i=0;i<arr[0].length;i++){
            if(i%2==0){
                for (int j=0;j<arr.length;j++){
                    System.out.print(arr[j][i]+" ");
                }
            }
            else {
                for (int j=arr.length-1;j>=0;j--){
                    System.out.print(arr[j][i]+" ");
                }
            }
            System.out.println();
        }
    }
}
