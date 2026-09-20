package Java_09_Binary_Search;

public class binary_03_search_in_decinding_0rder_in_array {
    static void main(String[] args) {
        int[] arr={999,231,55,23,19,12,5,-29,-484};
        int target=-29;
        int index=0;
        int n=arr.length;
        int low=0,high=n-1;
        while(low<=high){
            int mid=(high+low)/2;
            if (arr[mid]==target){
                System.out.println(mid);
                break;
            } else if (arr[mid]<target) {
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
    }
}
