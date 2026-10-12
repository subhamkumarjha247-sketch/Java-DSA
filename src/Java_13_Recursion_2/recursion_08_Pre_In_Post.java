package Java_13_Recursion_2;

public class recursion_08_Pre_In_Post {
    static void main(String[] args) {
        subh(3);
    }
    public static void subh(int n){
        if (n==0){
            return;
        }
        System.out.print(n+" ");     //   PRE

        subh(n-1);
        System.out.print(n+" ");      //  IN

        subh(n-1);
        System.out.print(n+" ");      //  POST
    }
}
