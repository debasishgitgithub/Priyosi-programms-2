import java.util.Scanner;
public class Matrix2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[][]={{10,20,30},{40,50,60},{70,80,90}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++) {
               System.out.print(a[i][j]+",");   
            }
            System.out.println();
        }
         
    }
}
    