package OOPS;

import java.util.Scanner;

public class oops_00_User_defined_data_type {
    public static class Student {
        String name;
        int roll_no;
        double  cgpa;

    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Student s1=new Student();
        s1.name="Subham";
        s1.roll_no=51;
        s1.cgpa=7.3;

        Student s2 =new Student();
        s2.name="Aman";
        s2.roll_no=1;
        s2.cgpa=7.4;

        Student s3 =new Student();
        s3.name="Rishav";
        s3.roll_no=sc.nextInt();
//        s3.roll_no=31;
        s3.cgpa=7.2;

        System.out.println(s1.name+" "+s1.roll_no+" "+s1.cgpa);

        s2.cgpa=7.1;
        System.out.println(s2.cgpa);

        System.out.println(s3.roll_no);

//        SHALLOW COPY
        Student s4=s1;
        s4.roll_no=101;
        System.out.println(s1.roll_no);

    }

}
