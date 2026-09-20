package Java_10_Strings;

public class string_05_Built_In_Methods {
    static void main(String[] args) {
        String s="Subham Jha";

        System.out.println(s.indexOf('a'));

        System.out.println(s.lastIndexOf('a'));

        System.out.println(s.indexOf('x'));

        System.out.println(s.toLowerCase());

        System.out.println(s.toUpperCase());

        System.out.println(s.contains("Subh"));

        if(s.contains("Subh")){
            System.out.println("happy");
        }

        System.out.println(s.startsWith("Sub"));

        s.toUpperCase();
        System.out.println(s);

        s=s.toUpperCase();
        System.out.println(s);
    }
}
