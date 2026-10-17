package Java_15_Cyclic_Sort;


public class cyclic_01_Cyclic_Sort {
    static void main(String[] args) {
        int[] arr={6,2,4,5,3,7,1};
        print(arr);
        missingNum(arr);
        System.out.println();
        print(arr);
    }

    static void missingNum(int[] arr) {
        int i=0;
        while(i<arr.length){
            int x=1+i;
            if(x==arr[i]){
                i++;
            }
            else {
                int idx=arr[i]-1;
                swap(arr,i,idx);
            }
        }
    }

    static void swap(int[] arr,int i,int idx) {
        int temp=arr[i];
        arr[i]=arr[idx];
        arr[idx]=temp;
    }

    static void print(int[] arr) {
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
