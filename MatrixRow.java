import java.util.Scanner;
public class MatrixRow {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][4];
        int sum=0;
        System.out.println("Enter the 12 numbers");
        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                a[i][j]=sc.nextInt();
                System.out.print(a[i][j]+",");
            }
            System.out.println();
        }
        
        for (int i=0;i<3;i++){
            sum =0;
            for (int j=0;j<4;j++){
                
                sum+=a[i][j];
            }
            System.out.println("sum of row"+(i+1)+":"+sum);
        }
    }
}
