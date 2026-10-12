package Java_13_Recursion_2;

public class recursion_09_tower_of_hanoi {
    static void main(String[] args) {
        hanoi(3,'A','B','C');
    }

    private static void hanoi(int n, char start, char helper, char dest) {
        if (n==0){
            return;
        }
        hanoi(n-1,start,dest,helper);   //  n-1 disk from A to B via C

        System.out.println(start+"->"+dest);

        hanoi(n-1,helper,start,dest);   //     n-1 disk from B to C via A
    }
}
