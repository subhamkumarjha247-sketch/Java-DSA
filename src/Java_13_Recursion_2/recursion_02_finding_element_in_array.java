package Java_13_Recursion_2;

public class recursion_02_finding_element_in_array {
    static boolean subh(int[] arr,int idx,int target) {
        if (idx==arr.length)
            return false;
        if (arr[idx]==target)
            return true;

        return subh(arr,idx+1,target);
    }

    static void main(String[] args) {
        int[] arr={3, 2, 6, 4, 10, 27, 8, 5, 23, 1, 2};
        int target=25;
        System.out.println(subh(arr,0,target));
    }
}
