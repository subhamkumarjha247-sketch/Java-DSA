package Java_05_Methods;

public class return_is_mendatory {
    static int subham(int a) {
        if(a>5){
            return a;
        }
        else {
           return 10;
        }
    }

    static void main(String[] args) {
        System.out.println(subham(3));
    }
}
