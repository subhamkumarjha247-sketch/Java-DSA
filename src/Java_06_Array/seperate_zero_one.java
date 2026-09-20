package Java_06_Array;

public class seperate_zero_one {
    static void main(String[] args) {
        int[] arr={0,0,1,1,0};
        int n=arr.length;
        int count_zero=0;
        int count_one=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count_zero++;
            }
            else{
                count_one++;
            }
        }
        for (int i=0;i<count_zero;i++){
            arr[i]=0;
        }
        for (int i=count_zero;i<n;i++){
            arr[i]=1;
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
