package Java_13_Recursion_2;

public class recursion_03_binary_search {
    static int subh(int[] arr,int target,int low,int high ) {
        if (low>high)
            return -1;
        int mid=(low+high)/2;
        if(arr[mid]==target)
            return mid;
        else if (arr[mid]>target){
            return subh(arr,target,low,mid-1);
        }
        else {
            return subh(arr,target,mid+1,high);
        }
    }
    static void main(String[] args) {
        int[] arr={-1,0,3,5,9,12};
        int n=arr.length;
        int target=9;
        System.out.println(subh(arr,target,0,n-1));
    }
}
