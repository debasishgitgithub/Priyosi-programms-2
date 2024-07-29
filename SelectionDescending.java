import java.util.Scanner;
public class SelectionDescending {
    public static void main(String args[]){
       int a[]={50,60,90,20,10};
       int l=a.length;

       System.out.println(" before sort");
         for(int i=0;i<l;i++){//print all the no. of an array
        System.out.println(a[i]);
        }
        
        //l=length of the arrayyyyyyyyy
       for(int i=0;i<l-1;i++){//iterate to no. which are not sorted
           int pos=i;
           int smallestnum=a[i];
           
           for(int j=i+1;j<l-i;j++){//find small no.
               if(smallestnum<a[j]){
                pos=j;
                smallestnum=a[j];
               }
            }
            a[pos]=a[i];
            a[i]=smallestnum;
       }
       
       System.out.println(" after sort");
       for(int i=0;i<l;i++){
        System.out.println(a[i]);
        }
       
    }
    
}