package Java_06_Array;

public class merge_two_sorted_array {
    static void main(String[] args) {
        int[] a = {2, 5, 6, 9, 20};
        int[] b = {1, 3, 4, 5, 7, 8};

        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length + b.length; i++) {
            System.out.print(c[i]+" ");
        }
        System.out.println();
        merge(c, a, b);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]+" ");
        }
        System.out.println();
    }

    public static void merge(int[] c, int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i = i + 1;
                k = k + 1;
            }
            else {
                c[k] = b[j];
                j = j + 1;
                k = k + 1;
            }
        }
        if(i==a.length){
            while(j<b.length){
                c[k] =b[j];
                j++;
                k++;
            }
        }
        else{
            while(i<a.length){
                c[k]=a[i];
                i++;
                k++;
            }
        }
    }
}



