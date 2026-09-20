package Java_08_Sorting;

public class bubble_sort {
    static void print(int[] arr) {
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void main(String[] args) {
        int[] arr={5,3,-2,6,7,2,0,7,2};
        int n=arr.length;
        print(arr);

        for (int i = 0; i <n-1-i; i++){
            for (int j = 0; j <n-1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

//                            Method  2

//        for(int i=0;i<n-1;i++){
//            boolean IsSorted=true;
//            for (int j=0;j<n-1;j++){
//                if(arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    IsSorted = false;
//                }
//            }
//            if (IsSorted==true)
//                break;
//        }

//                        Method  3

//        for (int i=0;i<n-1;i++){
//            int count=0;
//            for (int j=0;j<n-1;j++){
//                if(arr[j]<arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    count++;
//                }
//            }
//            if(count==0)
//                break;
//        }
        print(arr);
    }
}
