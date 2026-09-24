package Java_10_Strings;

public class string_20_stringBuilders {
    static void main(String[] args) {

//        StringBuilder t = new StringBuilder();
//        System.out.println(t.length() + " " + t.capacity());

         StringBuilder s = new StringBuilder(("Subham"));
         System.out.println(s.length()+" "+s.capacity());
         System.out.println(s);

         s.append("Jha");
         System.out.println(s);

         s.setCharAt(4,'u');
         System.out.println(s);

    }
}
