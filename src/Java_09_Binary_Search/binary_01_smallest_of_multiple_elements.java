package Java_09_Binary_Search;

public class binary_01_smallest_of_multiple_elements {
    static void main(String[] args) {
        int[] arr={0,1,1,1,2};
        int target=1;
        int index=0;
        int n=arr.length;
        int low=0,high=n-1;
        while(low<=high){
            int mid=(high+low)/2;
            if (arr[mid]==target){
                index=mid;
                high=mid-1;
            } else if (arr[mid]>target) {
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        System.out.println(index);
    }
}
