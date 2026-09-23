package Java_10_Strings;

public class string_16_allSubstringOfString {
    static void main(String[] args) {
        String s="Subham";
        for (int i=0;i<s.length();i++){
            for (int j=i;j<=s.length();j++){
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
