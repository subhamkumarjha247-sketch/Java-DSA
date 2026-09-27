package OOPS;

public class oops_05_Constructors {
    public static class car{
        int seats;  //  0
        String name;    //  null
        double length;  //  0.0
        car(){      //  DEFAULT CONSTRUCTOR

        }
        car(int x, String s, double l){
            seats = x;
            name = s;
            length = l;
        }
        void print(){
            System.out.println(seats+" "+name+" "+length);
        }
    }
    static void main(String[] args) {
        car c1=new car(5,"kia sonet",3.99);
        System.out.println(c1.name);
        c1.print();

        car c2=new car(4,"lord alto",3.75);
        c2.print();

        car c3=new car();
        c3.name="Honda amaze";      //CONSTRUCTOR OVERLOADING
    }
}
