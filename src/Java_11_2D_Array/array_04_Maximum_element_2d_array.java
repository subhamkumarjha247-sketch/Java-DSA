package Java_11_2D_Array;

public class array_04_Maximum_element_2d_array {
    static void main(String[] args) {
        int[][] arr={{6,0,2,3,5},{5,1,6,2,3},{5,2,6,4,7}};
        int max=0;
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
