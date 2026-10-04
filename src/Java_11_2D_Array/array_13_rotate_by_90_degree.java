package Java_11_2D_Array;

public class array_13_rotate_by_90_degree {
    static void print(int[][] arr) {
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


    static void main(String[] args) {
        int[][] arr= {{6,0,2,3,5},{5,1,6,2,3},{5,2,6,4,7},{7,6,9,3,3},{7,9,4,3,8}};
        print(arr);
        System.out.println();
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        print(arr);
        System.out.println();

        for (int i=0;i<arr.length;i++){
            int frist=0,last=arr[0].length-1;
            while(frist<=last){
                int temp=arr[i][frist];
                arr[i][frist]=arr[i][last];
                arr[i][last]=temp;
                frist++;
                last--;
            }
        }
        print(arr);
    }
}
