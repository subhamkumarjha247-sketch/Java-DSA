package OOPS;
class ComplexNumber{
    double x;
    double  y;
    ComplexNumber(){

    }
    ComplexNumber(double x,double y){
        this.x=x;
        this.y=y;
    }
    void print(){
        if(y>=0){
            System.out.println(x+" + "+y+"i");
        }
        else{
            System.out.println(x+" - "+(-y)+"i");
        }
    }

    public void add(ComplexNumber c) {
        x+= c.x;
        y+= c.y;

    }
    void subtract (ComplexNumber c){
        x-= c.x;
        y-= c.y;
    }
    void multiply(ComplexNumber z){
        double real=x*z.x - y*z.y;
        double imaginary=x*z.y + y*z.x;

        x=real;
        y=imaginary;
    }
    void divide(ComplexNumber z){
        double divideing_part=z.x*z.x+z.y*z.y;

        double real_part=(x*z.x + y*z.y)/divideing_part;
        double imaginary_part=(x*z.y - y*z.x)/divideing_part;
        x=real_part;
        y=imaginary_part;
    }
}

public class oops_13_complex_no {
    static void main(String[] args) {
        ComplexNumber c1=new ComplexNumber(4,3);
        c1.print();
        ComplexNumber c2=new ComplexNumber(4,-5);
        c2.print();

        c1.add(c2);
        c1.print();
        c2.print();

        c2.subtract(c1);
        c1.print();
        c2.print();

        c1.multiply(c2);
        c1.print();
        c2.print();

        c1.divide(c2);
        c1.print();
        c2.print();


    }
}
