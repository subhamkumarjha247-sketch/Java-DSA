package Java_09_Binary_Search;

        //USING BRUTE FORCE METHOD

public class binary_06_square_root {
    static void main(String[] args) {
        int n=63;
        int count=0;
        for (int i=1;i<=n;i++){
            if(i*i>n){
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
