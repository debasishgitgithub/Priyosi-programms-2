import java.util.Scanner;
public class ArraySwapping {
    public static void main(String args[]){
       int a[]={30,40,20,50,10};
       int pos=0;
       int smallestnum=a[0];
       for(int i=0;i<5;i++){
           
           if(smallestnum>a[i]){
            pos=i;
            smallestnum=a[i];
           }
        }
        a[pos]=a[0];
        a[0]=smallestnum;
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
       System.out.println("Smallest number is ="+a[pos]);
    }
    
}