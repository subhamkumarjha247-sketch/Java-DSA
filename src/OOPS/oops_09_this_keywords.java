package OOPS;

public class oops_09_this_keywords {
    public static class car{
        int price;
        String name;

        car(){

        }
        car(int price, String name){
//            price=price;
            this.price=price;
//            name=name;
            this.name=name;
        }
        car(String s, int x){
            price=x;
            name=s;
        }
        void print(){
            System.out.println(name+" "+price);
        }
    }



    static void main(String[] args) {
        car c1=new car(125000,"kia sonet");
        c1.print();

        car c2=new car("Lord aulto",400000);
        c2.print();
    }
}
