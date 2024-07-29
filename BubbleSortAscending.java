import java.util.Scanner;
public class BubbleSortAscending{
    public static void main(String args[]){
        int a[]={5,8,1,9,6};
        int i,j,temp,n;
        n=a.length;
        //sorting array a[]
        for (i=0;i<n;i++){//for stepssss
              for (j=0;j<n-1-i;j++) {//for value swapping
                  if(a[j]>a[j+1]){
                  temp=a[j];
                  a[j]=a[j+1];//swipe the greatest number
                  a[j+1]=temp;
              }
          }
        }
        System.out.println("The numbers in ascending order are=");//print values of sorted array
        for(i=0;i<n;i++){
         System.out.println(a[i]);   
        }
    }
}