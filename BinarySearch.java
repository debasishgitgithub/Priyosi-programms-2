import java.util.Scanner;
public class BinarySearch {
    public static void main(String args[]){
        int a[]={3,4,5,6,7};
        int search=5;
        int start=0;
        int end=4;
        int pos=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(a[mid]==search){
                pos=mid;
                break;
            } 
            else if (search>a[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        if(pos==-1){
            System.out.println("Not found");
        }
        else {
             System.out.println("Found");
        }
    }
}