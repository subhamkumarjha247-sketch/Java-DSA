package Java_11_2D_Array;

public class array_06_min_ele_outOf_allMax_ele_in_row {
    static void main(String[] args) {
        int[][] arr= {{6,0,20,3,5},{5,1,60,2,3},{5,2,6,4,7}};
        int Rowmax = Integer.MAX_VALUE;
        for (int i=0;i< arr.length;i++) {
            int max=0;
            for (int j=0;j<arr[0].length;j++){
                if(max<arr[i][j]){
                    max=arr[i][j];
                }
            }
            if(max<Rowmax){
                Rowmax=max;
            }
        }
        System.out.println(Rowmax);
    }
}
