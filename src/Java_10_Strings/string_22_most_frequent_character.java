package Java_10_Strings;

import java.util.Arrays;
import java.util.HashMap;

public class string_22_most_frequent_character {
    static void main(String[] args) {

        //      METHOD 1

//        String s="testsample";
//        int n=s.length();
//        int maxFreq = -1;
//        char answer=s.charAt(0);
//        for (int i=0;i<n;i++){
//            int freq=1;
//            char ch=s.charAt(i);
//            for (int j=i+1;j<n;j++) {
//                if (s.charAt(j) ==ch){
//                    freq++;
//                }
//            }
//            if(freq>maxFreq){
//                maxFreq=freq;
//                answer=ch;
//            } else if (freq == maxFreq && ch<answer) {
//                answer=ch;
//            }
//        }
//        System.out.println(answer);


        //      METHOD 2

        //      sledding windows

//        String s="testsamples";
//        int n=s.length();
//        int maxFreq = -1;
//        char answer=s.charAt(0);
//        char[] arr=s.toCharArray();
//        Arrays.sort(arr);
//        int i=0, j=0;
//        while (j<n){
//            if(arr[i]==arr[j]){
//                j++;
//            }
//            else {
//                int freq=j-i;
//                if(freq>maxFreq){
//                    maxFreq=freq;
//                    answer=arr[i];
//                }
//                i=j;
//            }
//        }
//        int freq=j-i;
//        if (freq>maxFreq){
//            maxFreq=freq;
//            answer=arr[i];
//        }
//        System.out.println(answer);

        //      METHOD 3

        //      HashMap

        String s="testsamples";
        int n=s.length();
        int[] arr=new int[26];
        for (int i=0;i<n;i++){
            char ch=s.charAt(i);
            int idx=ch-97;  //  ch-'a';
            arr[idx]++;
        }
        int maxfreq =0;
        char answer=s.charAt(0);
        for (int i=0;i<26;i++){
            System.out.print(arr[i]+" ");
            if(arr[i]>maxfreq){
                maxfreq=arr[i];
                answer=(char)(i+97);
            }
        }
        System.out.println();
        System.out.println(answer);
    }
}
