package Java_08_Sorting;

public class Selection_sort {
    static void print(int[] arr) {
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void main(String[] args) {
        int[] arr = {5,-2,6,7,2,0,2};
        print(arr);
        int n=arr.length;
        for (int i=0;i<n-1;i++) {
            int min = Integer.MAX_VALUE;
            int mindx = 0;
            for (int j = i; j < n ; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mindx = j;
//                }
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }
        print(arr);
    }
}
