package Java_12_Recursion;

public class recursion_05_Global_Variables {
    static int x=20;

    static void main(String[] args) {
        subh();
        System.out.println(x);
    }
    public static void subh(){
        x=10;
    }
}
