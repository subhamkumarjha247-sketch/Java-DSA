package OOPS;

public class oops_06_method_overloading {
    public static int max(int a, int b){
        System.out.println(Math.max(a,b));
        return 0;
    }
    public static int max(int a, int b, int c){
        System.out.println(Math.max(a,Math.max(b,c)));
        return 0;
    }

    static void main(String[] args) {
        max(4,5);
        max(8,5,11);
    }
}
