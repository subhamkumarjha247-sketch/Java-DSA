package Java_01_Basic_Cheeze;

public class IncrementDecrement_Of_Value {
    public static void main(String[] args){
        int x = 10;
        System.out.println(x);
        System.out.println(++x);
        System.out.println(x);

        System.out.println(" ");

        int y = 10;
        System.out.println(y);
        System.out.println(y++);
        System.out.println(y);

        System.out.println(" ");

        int p = 10;
        System.out.println(p);
        System.out.println(--p);
        System.out.println(p);

        System.out.println(" ");

        int q = 10;
        System.out.println(q);
        System.out.println(q--);
        System.out.println(q);

        System.out.println(" ");

        int a = 10;
        int b = a++;
        System.out.println(a+ " " +b);
    }
}
