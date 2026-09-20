package Java_05_Methods;

public class pass_by_value {
    static int subham(int x) {
        x = 10;
        return 0;
    }
    static void main(String[] args) {
        int x=6;
        System.out.println(x);
        subham(x);
        System.out.println(x);
    }
}
