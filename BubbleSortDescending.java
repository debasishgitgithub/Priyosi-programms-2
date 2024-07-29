import java.util.Scanner;
public class BubbleSortDescending{
    public static void main(String args[]){
        int a[]={5,8,1,9,6};
        int i,j,temp,n;
        n=a.length;
        for (i=0;i<n;i++){
          for (j=0;j<n-1;j++) {
              if(a[j]<a[j+1]){
                  temp=a[j];
                  a[j]=a[j+1];
                  a[j+1]=temp;
              }
          }
        }
        System.out.println("The numbers in descending order are=");
        for(i=0;i<n;i++){
         System.out.println(a[i]);   
        }
    }
}