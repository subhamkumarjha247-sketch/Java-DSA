package Java_06_Array;

public class Shallow_copy {
    static void main(String[] args) {
        int[] arr = {10,30,40,20,50};
        int[] x = arr;
        x[1]=100;
        System.out.println(arr[1]);
    }
}
