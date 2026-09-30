package Java_11_2D_Array;

public class array_03_sum_of_all_elements_of_2D_array {
    static void main(String[] args) {
        int[][] arr={{6,0,2,3,5},{5,1,6,2,3},{5,2,6,4,7}};
        int sum=0;
        for(int i=0;i< arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }

    public static class array_04_maximum_element_in_2D_array {
    }
}
