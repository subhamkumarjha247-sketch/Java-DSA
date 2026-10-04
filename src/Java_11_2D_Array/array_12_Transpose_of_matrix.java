package Java_11_2D_Array;

public class array_12_Transpose_of_matrix {
    static void main(String[] args) {
        int[][] arr= {{6,0,2,3,5},{5,1,6,2,3},{5,2,6,4,7},{7,6,9,3,3},{7,9,4,3,8}};
        print(arr);
        System.out.println();
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        print(arr);

    }


    public static void print(int[][] arr){
        for(int[] a:arr){
            for(int ele:a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
