package OOPS;

import java.util.ArrayList;

class Arraylist{
    int[] arr ;
    int idx=0;
    int size=0;

    Arraylist(int capacity){
        arr=new int[capacity];
    }
    int capacity(){
        return arr.length;
    }
    void add(int ele){
        arr[idx++]=ele;
        size++;
    }
    void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }

    int get(int index){
        return arr[index];
    }
    void add_more(int ele){
        if(idx==arr.length){
            IncreaseCapacity();
        }
        arr[idx++]=ele;
        size++;
    }
    void IncreaseCapacity(){
        int[] arr2=new int[arr.length*2];
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
        }
        arr=arr2;
    }

}



public class oops_16_Own_array_list {
    static void main(String[] args) {
//        ArrayList<Integer> arr=new ArrayList<>(8);

        Arraylist arr=new Arraylist(3);
        System.out.println(arr.capacity());

        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println(arr.size);

        arr.display();

        System.out.println(arr.get(1));

        arr.add_more(40);
        arr.display();
    }
}
