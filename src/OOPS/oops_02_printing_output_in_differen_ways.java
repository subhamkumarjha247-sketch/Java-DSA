package OOPS;

public class oops_02_printing_output_in_differen_ways {
    public static class Student{
        String name;
        int roll_no;
        double cgpa;
        void print(){
            System.out.println(name+" "+roll_no+" "+cgpa);
        }
    }

    static void main(String[] args) {
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
        s3.roll_no=31;
        s3.cgpa=7.2;

                //METHOD    1
        System.out.println(s1.name+" "+s1.roll_no+" "+s1.cgpa);
        System.out.println(s2.name+" "+s2.roll_no+" "+s2.cgpa);
        System.out.println(s3.name+" "+s3.roll_no+" "+s3.cgpa);
        System.out.println();

                //METHOD    2
        s1.print();
        s2.print();
        s3.print();
        System.out.println();

                //METHOD    3
        printing(s1);
        printing(s2);
        printing(s3);
    }
    public static void printing(Student s){
        System.out.println(s.name+" "+s.roll_no+" "+s.cgpa);
    }
}
