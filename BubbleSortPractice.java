import java.util.Scanner;
public class BubbleSortPractice{
    public static void main(String args[]){
        int a[]={90,20,70,50,60};
        int i,j,temp,l;
        l=a.length;
        
        for (i=0;i<l;i++){
              for (j=0;j<l-1-i;j++) {
                  if(a[j]>a[j+1]){
                  temp=a[j];
                  a[j]=a[j+1];
                  a[j+1]=temp;
              }
          }
        }
        System.out.println("The numbers in ascending order are =");
        for(i=0;i<l;i++){
         System.out.println(a[i]);   
        }
    }
}