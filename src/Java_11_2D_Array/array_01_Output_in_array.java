package Java_11_2D_Array;

public class array_01_Output_in_array {
    static void main(String[] args) {
//        int[][] arr=new int[3][5];

//                OR

        int[][] arr={{6,0,2,3,5},{5,1,6,2,3},{5,2,6,4,7}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
