package Java_08_Sorting;

public class move_all_zero {
    static void print(int[] arr) {
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void main(String[] args) {
        int[] arr = {1, 0, -2, 3, 0, 4, 8, 0, 10, 12};
        print(arr);
//        for (int i=0;i<arr.length-1;i++) {
//            for (int j = 0; j < arr.length - 1; j++) {
//                if (arr[j] == 0) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        print(arr);

//                Method   2

        int j=0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]!=0){
                if(i!=j){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }
        }
        print(arr);
    }
}

