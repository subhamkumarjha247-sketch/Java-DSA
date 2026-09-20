package Java_08_Sorting;

public class Selection_sort_part_two {
    static void print(int[] arr) {
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void main(String[] args) {
        int[] arr={8,4,1,9,-3,6,5};
        print(arr);
        int n = arr.length;
        for (int i=0;i<n-1;i++){
            int max=Integer.MIN_VALUE;
            int index=0;
            for(int j=0;j<n-i;j++){
                if (arr[j]>max){
                    max=arr[j];
                    index=j;
                }
            }
            int temp=arr[n-1-i];
            arr[n-1-i]=arr[index];
            arr[index]=temp;
        }
        print(arr);
    }
}
