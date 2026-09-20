package Java_09_Binary_Search;

public class binary_07_square_root {
    static void main(String[] args) {
        int n=14;
        int low=0,high=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(mid*mid==n){
                System.out.println(mid);
            }
            else if(mid*mid>n){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        System.out.println(high);
    }
}
