package Java_14_Merge_Sort;

public class merge_00_Merge_Sort {
    static void main(String[] args) {
        int[] arr={5,2,8,1,4,6,3,7,9};
        print(arr);
        System.out.println();
        mergesort(arr);
        print(arr);
    }

    static void mergesort(int[] arr) {
        int n=arr.length;
        if (n==1){
            return;
        }

        int idx=0;
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];

        for (int i=0;i<a.length;i++){
            a[i]=arr[idx++];
        }
        for (int i=0;i<b.length;i++){
            b[i]=arr[idx++];
        }
        mergesort(a);
        mergesort(b);

        merge(a,b,arr);
    }

    static void print(int[] arr) {
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }

    static void merge(int[] a, int[] b, int[] c) {
        int i=0, j=0, k=0;
        while (i<a.length && j<b.length){
            if (a[i]<b[j]){
                c[k]=a[i];
                i++;
                k++;
            }
            else {
                c[k]=b[j];
                j++;
                k++;
            }
        }
        if (i==a.length){
            while(j<b.length){
                c[k]=b[j];
                j++;
                k++;
            }
        }
        else {
            while(i<a.length){
                c[k]=a[i];
                i++;
                j++;
            }
        }
    }

}
