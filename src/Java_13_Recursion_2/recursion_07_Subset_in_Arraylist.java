package Java_13_Recursion_2;

import java.util.ArrayList;
import java.util.List;

public class recursion_07_Subset_in_Arraylist {
    static void main(String[] args) {
        String s="abc";
        List<String> list=new ArrayList<>();
        subh("",s,0,list);
        System.out.print(list);
    }

    static void subh(String ans, String s, int idx, List<String> list) {
        if(idx==s.length()){
            if (ans.length()!=0)
                list.add(ans);
            return;
        }
        char ch=s.charAt(idx);
        subh(ans+ch,s,idx+1,list);
        subh(ans,s,idx+1,list);
    }
}
