package Java_13_Recursion_2;

public class recursion_04_frist_occurence_of_array {
    static int subh(int[] arr, int target, int low, int high) {
        if (low>high)
            return -1;
        int idx=-1;
        int mid=(low+high)/2;
        if(arr[mid]==target){
            int ans=subh(arr,target,low,mid-1);
            if(ans==-1){
                return mid;
            }
            else {
                return ans;
            }
        }
        else if (arr[mid]>target){
            return subh(arr,target,low,mid-1);
        }
        else {
            return subh(arr,target,mid+1,high);
        }
    }

    static void main(String[] args) {
        int[] arr={3,4,6,6,7,7,7,9,12,25,84,94};
        int target=7;
        int n=arr.length;
        System.out.println(subh(arr,target,0,n-1));
    }
}
