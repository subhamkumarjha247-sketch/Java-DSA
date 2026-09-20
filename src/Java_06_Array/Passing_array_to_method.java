package Java_06_Array;

public class Passing_array_to_method {
    static void main(String[] args) {
        int[] arr = {2,5,9,4,6};
        System.out.println(arr[2]);
        change(arr);
        System.out.println(arr[2]);
    }
    public static void change(int[] y){
        y[2]=15;
    }
}
