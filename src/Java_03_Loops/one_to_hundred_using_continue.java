package Java_03_Loops;

public class one_to_hundred_using_continue {
    static void main(String[] args) {
        for (int i=1; i<=10; i++){
            System.out.println(i);
            if(i==5){
                continue;
            }
            System.out.println("Good Morning");
        }
    }
}
