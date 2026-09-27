package OOPS;

class Student{
    String name;    //initially null
    private int roll_no;    //0
    double cgpa;    //0.0
    void print(){
        System.out.println(name+" "+roll_no);
    }


    private void printing(){
        System.out.println(name+" "+roll_no);
    }
    public void p(){
        printing();
    }


    int getRoll_no(){
        return roll_no;     //GETTER
    }

    void setRoll_no(int x){
        roll_no=x;             //SETTER
    }

}

public class oops_04_PrivateKeyword {
    static void main(String[] args) {
        Student s1=new Student();
        s1.name="Subham";
//      s1.roll_no=51;    //     can not directly added
        s1.setRoll_no(51);
        System.out.println(s1.getRoll_no());


        Student s2=new Student();
        s2.name="aman";
//        s2.roll_no=1;         can not directly added
        s2.setRoll_no(1);
        System.out.println(s2.getRoll_no());


        s1.print();
        s2.print();

        s1.p();
        s2.p();
    }
}
