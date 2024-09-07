import java.util.Scanner;
public class MatrixSum2 {
    public static void main(String args[]){
        int a[][]={{1,2,3},{4,5,6,}};
        int sum=0;
         for (int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                sum=sum+a[i][j];
                System.out.print(a[i][j]+",");
            }
             System.out.println();
        }
        System.out.println("The total sum of this matrix is="+sum);
    }
}