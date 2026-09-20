package Java_07_Time_And_Space_Complexity;

public class Que_one_method_two {
    static void main(String[] args) {
        int[] arr={5,1,3,4,2,4};
        int n=arr.length;
        boolean[] flag=new boolean[n+1];
        for(int i=0;i<n;i++) {
//            int ele=arr[i];
            if (flag[arr[i]] == true) {
                System.out.println("found");
                break;
            }
            flag[arr[i]]=true;
        }
    }
}
