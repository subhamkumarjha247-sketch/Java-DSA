package Java_12_Recursion;

public class recursion_01_Function_calling_Itself {
    static void subh(int n){
        if(n==5){
            return;
        }
        System.out.println("Subham Jha");
        subh(n+1);
    }

    static void main(String[] args) {
        subh(0);
    }
}
