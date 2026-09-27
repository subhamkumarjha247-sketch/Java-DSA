package OOPS;

class Cricketer{
    final String country="india";
    String name;
    int run;
    double avg;

}

public class oops_10_final_keyword {
    static void main(String[] args) {
        Cricketer c1=new Cricketer();
//        c1.country="nepal";     ERRER DEGA YE LINE
        System.out.println(c1.country);

        Cricketer c2=new Cricketer();
        System.out.println(c2.country);
    }
}
