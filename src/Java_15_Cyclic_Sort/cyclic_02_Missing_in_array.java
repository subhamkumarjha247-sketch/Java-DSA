package Java_15_Cyclic_Sort;

public class cyclic_02_Missing_in_array {
    static void main(String[] args) {
        int[] arr={8,2,4,5,3,7,1};
        print(arr);
        missingNum(arr);
        System.out.println();
        print(arr);
        System.out.println();
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                System.out.println(i+1);
            }
        }

    }

    static void missingNum(int[] arr) {
        int n=arr.length+1;
        int i=0;
        while(i<arr.length){
            if (arr[i]==i+1 || arr[i]==n){
                i++;
            }
            else {
                int idx=arr[i]-1;
                swap(arr,i,idx);
            }
        }
    }

    static void swap(int[] arr,int i,int idx) {
        int temp=arr[idx];
        arr[idx]=arr[i];
        arr[i]=temp;
    }


    static void print(int[] arr) {
        for (int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
