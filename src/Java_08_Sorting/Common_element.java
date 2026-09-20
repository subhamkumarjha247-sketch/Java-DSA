package Java_08_Sorting;

public class Common_element {
    static void main(String[] args) {
        int[] arr_one={3,4,2,2,4};
        int[] arr_two={3,2,2,7};
        for (int i=0;i< arr_one.length;i++){
            for (int j=0;j< arr_two.length;j++){
                if(arr_one[i]==arr_two[j]){
                    System.out.print(arr_two[j]+" ");
                    break;
                }
            }
        }
    }
}
