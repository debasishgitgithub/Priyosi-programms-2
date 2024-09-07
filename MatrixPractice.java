import java.util.Scanner;
public class MatrixPractice {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int p[][]={{59,69,79},{89,99,109},{119,129,139}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(p[i][j]+",");
            }
            System.out.println();
        }
    }
}