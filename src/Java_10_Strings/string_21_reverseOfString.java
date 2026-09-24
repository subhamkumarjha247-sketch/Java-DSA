package Java_10_Strings;

public class string_21_reverseOfString {
    static void main(String[] args) {
        String s="Subham";
        StringBuilder sb=new StringBuilder(s);

//        sb.reverse();
//        System.out.println(sb);

//        int i=0, j=sb.length()-1;
//        while(i<=j){
//            char temp1 = sb.charAt(i);
//            char temp2 = sb.charAt(j);
//            sb.setCharAt(i,temp2);
//            sb.setCharAt(j,temp1);
//            i++;
//            j--;
//        }
//        System.out.println(sb);
//
//         sb.deleteCharAt(4);
//        System.out.println(sb);
//
//         sb.insert(4,'u');
//        System.out.println(sb);
//
//         sb.delete(4,6);
//         System.out.println(sb);

         sb.reverse();
         s=sb.toString();
        System.out.println(s);
    }
}
