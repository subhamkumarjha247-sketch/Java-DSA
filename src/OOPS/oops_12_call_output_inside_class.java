package OOPS;
class players {
    static String country="India";
    String name;
    int run;
    double avg;

    void print(){
        System.out.println(name+" "+run+" "+avg);
    }
}

public class oops_12_call_output_inside_class {
    static void main(String[] args) {
        players c1 = new players();
        c1.name="subham";
        c1.run=36;
        c1.avg=60.76;
        c1.print();

        players c2=new players();
        c2.name="golu";
        c2.run=128;
        c2.avg=80.76;
        c2.print();
    }
}
