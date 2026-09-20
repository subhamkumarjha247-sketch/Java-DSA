package Java_03_Loops;

public class Odd_No_Div_By_Three {
    static void main(String[] args) {
        for(int i=1; i<=100; i++){
            if(i%2 != 0 && i%3 ==0){
                System.out.print(i+" ");
            }
        }
    }
}
