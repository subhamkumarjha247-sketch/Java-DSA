package Java_06_Array;

public class Rotate_array_using_diff_array {
    static void main(String[] args) {
        int[] arr={54,89,296,32,67,7,109};
        int d=3;
        int n=arr.length;
        d = d%n;

        int[] arr_two = new int[n];
        int j=0;
        for (int i=n-d-1;i<n;i++){
            arr_two[j]=arr[i];
            j++;
        }
        for (int i=0;i<d;i++){
            arr_two[j]=arr[i];
            j++;
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr_two[i]+" ");
        }
    }

}
