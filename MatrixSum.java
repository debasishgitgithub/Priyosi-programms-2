import java.util.Scanner;
public class MatrixSum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[2][3];
        int sum=0;
         for (int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.println("Enter numbers");
                a[i][j]=sc.nextInt();
                
            }
             System.out.println();
        }
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