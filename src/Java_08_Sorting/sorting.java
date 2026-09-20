package Java_08_Sorting;

public class sorting {
    static void main(String[] args) {
        int[] arr = {90,80,100,40,30};
        int count=0;
        for (int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                count++;
            }
        }
        if(count==0)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
