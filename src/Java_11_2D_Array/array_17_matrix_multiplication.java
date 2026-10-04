package Java_11_2D_Array;

public class array_17_matrix_multiplication {
    public static void print(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+"    ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void main(String[] args) {
        int[][] arr= {{1,3,2},{3,1,2},{2,2,1}};
        print(arr);
        int n=arr.length;
        int[][] c=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                for (int k=0;k<n;k++){
                    c[i][j] += arr[i][k]*arr[k][j];
                }
            }
        }
        print(c);
    }
}
