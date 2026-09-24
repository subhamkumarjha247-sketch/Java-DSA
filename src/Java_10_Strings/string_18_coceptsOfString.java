package Java_10_Strings;

public class string_18_coceptsOfString {
    static void main(String[] args) {
        String s="Subham";

//        s="Golu";
//        System.out.println(s);

//        String t="Subham";
//        String a=new String("Subham");
//        System.out.println(t);
//        System.out.println(a);
//        System.out.println(s);

//          s+="Jha";
//        System.out.println(s);

        s=s.substring(0,3) + 'x' +s.substring(4);
        System.out.println(s);
    }
}
