package Java_05_Methods;

public class max_of_three_in_returnType {
    static int subham(int a, int b, int c) {
        if(a>b&&b>c) return a;
        else if (b>a&&b>c) return b;
        else return c;
    }

    static void main(String[] args) {
//        System.out.println(subham(2,8,5));
        int x=subham(2,8,5);
        System.out.println(x);
    }
}
