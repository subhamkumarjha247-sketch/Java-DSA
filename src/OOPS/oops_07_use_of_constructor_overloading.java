package OOPS;

public class oops_07_use_of_constructor_overloading {
    public static class car{
        int price;
        String name;

        car(){

        }
        car(int x, String s){
            price=x;
            name=s;
        }
        car(String s,int x){
            price =x;
            name=s;
        }
        void print(){
            System.out.println(price+" "+name);
        }
    }
    static void main(String[] args) {
        car c1 =new car(1250000,"kia sonet");
        c1.print();

        car c2=new car("Lord aulo",400000);
        c2.print();

    }
}
