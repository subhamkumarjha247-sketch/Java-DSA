package OOPS;

class Fraction{
    int num;
    int den;

    Fraction(){

    }
    Fraction(int num,int den){
        this.num=num;
        this.den=den;
    }
    void print(){
        System.out.println(num+"/"+den);
    }

    void add(Fraction f){
        num=num*f.den + den*f.num;
        den=den*f.den;
        simplefy();

    }
    void multiply(Fraction f){
        num=num*f.num;
        den=den*f.den;
        simplefy();
    }
    void divide(Fraction f){
        num=num*f.den;
        den=den*f.num;
        simplefy();
    }
    void simplefy(){
        boolean IsNegative = (num*den<0) ? true : false;
        num=Math.abs(num);
        den=Math.abs(den);
        int gcd=hcf(num,den);
        num=num/gcd;
        den=den/gcd;
        if(IsNegative){
            num= -num;
        }
    }

    int hcf(int a,int b){
        if(a==0){
            return b;
        }
        return hcf(b%a,a);
    }
}


public class oops_14_fractions {
    static void main(String[] args) {
        Fraction f1=new Fraction(-4,5);
        f1.print();

        Fraction f2=new Fraction(5,4);
        f2.print();

        f1.add(f2);
        f1.print();
        f2.print();

        f1.multiply(f2);
        f1.print();
        f2.print();

        f1.divide(f2);
        f1.print();
        f2.print();
    }
}
