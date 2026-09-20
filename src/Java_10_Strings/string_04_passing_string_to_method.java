package Java_10_Strings;

public class string_04_passing_string_to_method {
    static void change(String s) {
        s="Golu";
    }


    static void main(String[] args) {
        String s="subham";
        System.out.println(s);
        change(s);
        System.out.println(s);
    }
}
