import java.util.Scanner;
public class LinearSearch2 {
    public static void main(String args[]){
        int a[]={69,55,45,99,35};
        int search=9;
        int pos=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]==search){
                pos=i;
            }
        }
        if (pos==-1){
            System.out.println("Not Found");
        }
        else {
           System.out.println("Found"); 
        }
    }
}
    