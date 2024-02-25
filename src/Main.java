import java.util.Scanner;

class Customer{
    Scanner ent = new Scanner(System.in);
    private  int id;
    private String address;
   private int newmeternumber;
   private int oldmeternumber;
   private int newEnergyUse;
   private int oldEnergyUse;
   private int summeterwater;
   private int sumEnergyUsed;
   private int priceofwater;
   private int priceofEnergy;
   private int sumElectric;
   private int sumWater;
   private int total;

    public Customer(int oldmeternumber, int oldEnergyUse, int priceofEnergy, int priceofwater) {
        this.oldmeternumber = oldmeternumber;
        this.oldEnergyUse = oldEnergyUse;
        this.priceofEnergy = priceofEnergy;
        this.priceofwater =priceofwater;
    }

    public void input(){
       System.out.println("Enter your ID first :");
       id = ent.nextInt();
       ent.nextLine();
       System.out.println("Enter Customer address:");
       address= ent.nextLine();
       System.out.println("Enter Water meter use new month:");
       newmeternumber = ent.nextInt();
       System.out.println("Enter your New month energy use :");
       newEnergyUse = ent.nextInt();

   }
    public void output(){
        System.out.println("Customer ID:"+ id);
        System.out.println("Customer Address: " + address);
        System.out.println("Customer oldmeterNumber: " + oldmeternumber);
        System.out.println("Customer NewmeterNumber: " + newmeternumber);
        System.out.println("Customer OldEnergyNumber: " + oldEnergyUse);
        System.out.println("Customer NewEnergyNumber: " + newEnergyUse);
        System.out.println("Customer Calculate Water Meter Used: " + CalWaterMeter());
        System.out.println("Customer Calculate ElectricEnergy Used: " + calElectricEnergy());
        System.out.println("Customer Total Electricbill: " + ElectricPrice());
        System.out.println("Customer Total WaterBill: " + WaterMeterPrice());
        System.out.println("Customer Total Bill this month: " + RenterBill());
    }

    public int CalWaterMeter(){
        return summeterwater = newmeternumber - oldmeternumber;
    }

    public int calElectricEnergy(){
        return sumEnergyUsed = newEnergyUse - oldEnergyUse;

    }

    public int ElectricPrice(){
        return sumElectric = sumEnergyUsed * priceofEnergy;
    } 

    public int WaterMeterPrice(){
        return sumWater = summeterwater  *priceofwater;
    }

    public int RenterBill( ){
        return total = sumElectric + sumWater;
    }

}
public class Main {
    public static void main(String[] args) {
        Customer renter = new Customer(917, 7511, 700, 1000);
        System.out.println("Welcome to Saren Electric - Water Billing System-->");
        System.out.println("Please fill the information here-->");
        renter.input();
        System.out.println("Here is this month bill-->");
        renter.output();



    }
}
