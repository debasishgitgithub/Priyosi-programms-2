import java.util.Scanner;
public class ArrayMerging {
    public static void main(String args[]){
        int a[]={10,20,30,40,50};
        int b[]={60,70,80};
        int mergeAr[]=new int[a.length+b.length];
        int k=0;
        for(int i=0;i<a.length;i++){
            mergeAr[k++]=a[i];
            
        }
        for(int i=0;i<b.length;i++){
            mergeAr[k++]=b[i];
        }
        for(int i=0;i<mergeAr.length;i++){
            System.out.println(mergeAr[i]);
        }
    }
}