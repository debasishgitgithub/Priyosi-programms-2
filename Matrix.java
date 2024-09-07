import java.util.Scanner;
public class Matrix{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int row=4;
        int column=5;
        //int a[][]=new int[4][5];
        int a[][]=new int[row][column];
        for(int i=0;i<row;i++){
          for(int j=0;j<column;j++) {
              System.out.println("Enter number");
              a[i][j]=sc.nextInt();
          }
        }
            
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++) {
               System.out.print(a[i][j]);   
            }
            System.out.println();
        }
         
    }
}
    