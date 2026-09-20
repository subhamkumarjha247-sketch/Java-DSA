package Java_06_Array;

public class rotate_Array_Using_SameArray {
    static void rotateArr(int[] arr, int d) {
        int n = arr.length;
        d=d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }

    static void reverse(int[] arr, int i, int j) {
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    static void main(String[] args) {
        int[] arr={51,84,37,95,7,65,32};
        int d=3;

        rotateArr(arr,d);

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
