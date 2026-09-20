package Java_06_Array;

public class Two_sum_method_two {
    public static void main(String[] args) {
        System.out.println("Two sum");

    }

    public static  boolean twosum(int arr[], int target) {
        int n = arr.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
