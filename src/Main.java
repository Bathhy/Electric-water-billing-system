import java.util.Scanner;

class Customer{
    Scanner ent = new Scanner(System.in);
    private  int id;
    private String address;
   private int newmeternumber;
   private int oldmeternumber;
   private int newEnergyUse;
   private int oldEnergyUse;

   public void input(){
       System.out.println("Enter your ID first :");
       id = ent.nextInt();
       System.out.println("Enter Customer address:");
       address= ent.nextLine();
       System.out.println("Enter Water meter use last month:");
       oldmeternumber = ent.nextInt();
       System.out.println("Enter Water meter use new month:");
       newmeternumber = ent.nextInt();

       System.out.println("Enter your Last month energy use:");
       oldEnergyUse = ent.nextInt();
       System.out.println("Enter your New month energy use :");
       newEnergyUse = ent.nextInt();

   }



}


public class Main {
    public static void main(String[] args) {

    }
}