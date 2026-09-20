package Java_09_Binary_Search;

public class Binary_00_search {
    static void main(String[] args) {
        int[] arr={-76,-4,8,28,47,510,615,9911,9999};
        int target=10;
        int n=arr.length;
        int low =0, high =n-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                break;
            } else if (arr[mid]>target) {
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        int k=0;
        for (int i=0;i<n-1;i++){
            if(arr[i] != target){
                k++;
            }
        }
        if(k>0){
            System.out.println(-1);
        }
    }
}
