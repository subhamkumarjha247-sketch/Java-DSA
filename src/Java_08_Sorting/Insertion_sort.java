package Java_08_Sorting;

public class Insertion_sort {
    static void main(String[] args) {
        int[] arr={4,1,17,31,9,2,0,8,6};
        for (int i=0;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
