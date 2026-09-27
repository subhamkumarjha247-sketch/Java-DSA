package OOPS;

class Cricketers{
    static String country="India";
    String name;
    int run;
    double avg;
}
public class oops_11_static_keyword {
    static void main(String[] args) {
        Cricketers c1=new Cricketers();
        c1.country ="nepal";

        Cricketers c2=new Cricketers();
        System.out.println(c1.country);
        System.out.println(c2.country);
    }
}
