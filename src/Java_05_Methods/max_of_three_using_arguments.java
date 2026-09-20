package Java_05_Methods;

public class max_of_three_using_arguments {
    public  static void max(int a,int b,int c){
//        System.out.println(Math.max(Math.max(a,b),c));
//        or
        if (a>b&&a>c){
            System.out.println(a);
        } else if (b>c&&c>a) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
    public static void main() {
        max(3,8,5);
    }
}
