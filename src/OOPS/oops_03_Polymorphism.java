package OOPS;

import java.security.spec.ECGenParameterSpec;

public class oops_03_Polymorphism {
    public static class Dogs{
        void speak(){
            System.out.println("bhau bhau");
        }
    }
    public static class Cat{
        void speak(){
            System.out.println("meau meau");
        }
    }
    public static class human{
        void speak(){
            System.out.println("hello");
        }
    }
    public static class Lion{
        void speak(){
            System.out.println("garrr garrr");
        }
    }

    static void main(String[] args) {
        Dogs d=new Dogs();
        Cat c=new Cat();
        human h=new human();
        Lion l=new Lion();

        d.speak();
        c.speak();
        h.speak();
        l.speak();
    }
}
