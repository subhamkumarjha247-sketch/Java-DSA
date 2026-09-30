package OOPS;

class Vehicle{
    int wheels;
    int spped;
    int seats;

    void print(){
        System.out.println(wheels+" "+spped+" "+seats);
    }
    Vehicle(){

    }
    Vehicle(int wheels,int spped,int seats){
        this.wheels=wheels;
        this.spped=spped;
        this.seats=seats;
    }
}
class PowerVehicle extends Vehicle{
    int engine;
}
class Aircrafts extends PowerVehicle{
    int rotors;
}

public class oops_15_Inheritance {
    static void main(String[] args) {
        Vehicle cycle = new Vehicle(4,150,4);
        cycle.print();

        Aircrafts miraj=new Aircrafts();
        miraj.spped=500;
        System.out.println(miraj.spped);
    }

}
