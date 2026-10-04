package Java_11_2D_Array;

public class array_16_spirally_traversing_matrix {
    public static void print(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+"    ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void main(String[] args) {
        int[][] arr= {{6,0,2,3,5},{5,1,6,2,3},{5,2,6,4,7},{7,6,9,3,3},{7,9,4,3,8}};
        print(arr);
        int n= arr.length,m=arr[0].length;
        int fRow=0, lRow=n-1,  fCol=0,  lCol=m-1;

        while (fRow<=lRow && fCol<=lCol) {

            for (int i = fCol; i <= lCol; i++) {
                System.out.print(arr[fRow][i] + "   ");
            }
            fRow++;
            if(fRow>lRow || fCol>lCol)
                break;
            for (int i = fRow; i <= lRow; i++) {
                System.out.print(arr[i][lCol] + "   ");
            }
            lCol--;
            if(fRow>lRow || fCol>lCol)
                break;
            for (int i = lCol; i >= fCol; i--) {
                System.out.print(arr[lRow][i] + "   ");
            }
            lRow--;
            if(fRow>lRow || fCol>lCol)
                break;
            for (int i = lRow; i >= fRow; i--) {
                System.out.print(arr[i][fCol] + "   ");
            }
            fCol++;
            if(fRow>lRow || fCol>lCol)
                break;
        }
    }
}
