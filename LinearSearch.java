public class LinearSearch {
    public static void main(String args[]){
        int a[]={3,6,9,8,5};
        int search=9;
        int pos=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]==search){
                pos=i;
            }
        }
        if (pos==-1){
            System.out.println("Not found");
        }
        else {
           System.out.println("Found"); 
        }
    }
}