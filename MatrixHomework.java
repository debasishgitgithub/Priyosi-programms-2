public class MatrixHomework {
    public static void main (String args[]){
        int a[][]={{1,3,5},{4,6,8},{9,2,4}};
        int sum=0;
        for(int i=0;i<3;i++){
          sum+=a[i][i];  
        }
        System.out.println("Sum of the left diagonal is="+sum);
    }
}