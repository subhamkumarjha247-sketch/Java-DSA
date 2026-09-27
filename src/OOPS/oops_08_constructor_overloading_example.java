package OOPS;

import java.util.Arrays;

public class oops_08_constructor_overloading_example {
    public static class StudentData{
        int roll_no;
        int[] marks;

        StudentData(int[] s){
            marks = Arrays.copyOf(s,s.length);
        }

        StudentData(int s){
            marks=new int[s];
        }
    }

    static void main(String[] args) {
        int[] arr={4,7,1,4,8};
        StudentData s1=new StudentData(arr);
        s1.marks[0]=40;
        System.out.println(arr[0]);

        StudentData s2=new StudentData(2);

    }
}
