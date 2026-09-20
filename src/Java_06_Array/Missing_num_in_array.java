package Java_06_Array;

public class Missing_num_in_array {
    public static void main(String[] args) {
            int[] arr={8,2,4,5,3,7,1};
            int n= arr.length+1;
            int sum=n*(n+1)/2;
            int arr_sum=0;
            for(int i=0;i<n-1;i++){
                arr_sum+=arr[i];
            }
        System.out.println(sum - arr_sum);
    }
}
