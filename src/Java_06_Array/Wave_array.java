package Java_06_Array;

public class Wave_array {
    static void main(String[] args) {
        int[] arr={2,4,7,8,9,10};
        int n=arr.length;
        int i=1;
            for(;i<n;i+=2){
                int temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
            }
        for (int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
