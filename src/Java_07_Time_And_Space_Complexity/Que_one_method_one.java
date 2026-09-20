package Java_07_Time_And_Space_Complexity;

public class Que_one_method_one {
    static void main(String[] args) {
        int[] nums={5,1,3,4,2,7};
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        if(count>0){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
