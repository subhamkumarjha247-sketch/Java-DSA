package Java_09_Binary_Search;

public class binary_04_floor_in_sorted_array {
    static void main(String[] args) {
        int[] arr={1,2,4,10,10,12,19};
        int x=11;
        int n=arr.length;
        int low=0,high=n-1;
        int index=0;
        while(low<=high){
            int mid=(high+low)/2;
            if (arr[mid]<=x) {
                low=mid+1;
                index=mid;
            } else {
                high=mid-1;
            }
        }
        System.out.println(index);
    }
}
