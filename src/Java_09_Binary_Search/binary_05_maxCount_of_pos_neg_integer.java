package Java_09_Binary_Search;

public class binary_05_maxCount_of_pos_neg_integer {
    static void main(String[] args) {
        int[] nums={-3,-2,-1,1,2,3};
        int n=nums.length;
        int low=0,high=n-1;
        int count_neg=0;
        int count_pos=0;
        while(low<=high){
            int mid=(high+low)/2;
            if(nums[mid]<0){
                low=mid-1;
                count_neg++;
            }
            else {
                high=mid+1;
                count_pos++;
            }
//            else {
//
//            }
        }
        if (count_neg>=count_pos){
            System.out.println(count_neg);
        }
        else {
            System.out.println(count_pos);
        }
    }
}
