package OOPS;

public class oops_01_passing_classes_to_methods {
    public static class Car{
        int price;
        String name;
        double length;
        int max_speed;
        String type;

        void print(){
            System.out.println(price+" "+name+" "+length+" "+max_speed+" "+type);
        }
    }

    static void main(String[] args) {
        Car c=new Car();
        c.price=5000000;
        c.name ="superfast";
        c.length =3.99;
        c.max_speed=100;
        c.type="Thar";
        System.out.println(c.max_speed);

        c.print();

        change(c);
        System.out.println(c.max_speed);
    }
    public static void change(Car x){       //  or  change(Car c)
        x.max_speed=120;                   //       c.max_speed=120;
    }
}
