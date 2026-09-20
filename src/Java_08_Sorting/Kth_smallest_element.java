package Java_08_Sorting;

public class Kth_smallest_element {
    static void main(String[] args) {
        int[] arr={2,3,1,20,15};
        int n=arr.length;
        int k=2;
        for (int i=0;i<k;i++){
            int min=Integer.MAX_VALUE;
            int index =0;
            for (int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(arr[k-1]);
    }
}
