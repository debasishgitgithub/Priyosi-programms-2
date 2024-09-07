import java.util.Scanner;
public class ArrayMerging2 {
    public static void main(String args[]){
        int a[]={10,20,30,40,50};
        int b[]={60,70};
        int mergeAr[]=new int[a.length+b.length];
        int minLength=a.length<b.length ? a.length : b.length;
        int i,j,k=0;
        for (i=0;i<minLength;i++){
            mergeAr[k++]=a[i];
            mergeAr[k++]=b[i];
        }
        if(a.length>b.length){
            for(j=i;j<a.length;j++){
                mergeAr[k++]=a[i];
            }
        } else {
           for(j=i;j<b.length;j++){
                mergeAr[k++]=b[j];
            } 
        }
        for(int p=0;p<mergeAr.length;p++){
         System.out.println(mergeAr[p]);   
        }
    }
}