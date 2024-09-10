import java.util.Scanner;

public class ParkingLot {
    public int vno;
    public int hours;
    public double bill;

    public static void main(String[] args) {
       ParkingLot obj = new ParkingLot();
       obj.input();
       obj.bill = obj.calculate();
       System.out.println("the bill is "+ obj.bill);
       System.out.println("the vno is "+ obj.vno);
    }
   
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter vno");
        this.vno = sc.nextInt();
        System.out.println("enter parking hours");
        this.hours = sc.nextInt();
    }

    public double calculate(){
        return this.hours *3;
    }
}