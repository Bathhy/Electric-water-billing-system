import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CreateBill {
    public static final String filename = "javaElectandWater.txt";
    private int id;
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

    public CreateBill(int oldmeternumber, int oldEnergyUse, int priceofEnergy, int priceofwater) {
        this.oldmeternumber = oldmeternumber;
        this.oldEnergyUse = oldEnergyUse;
        this.priceofEnergy = priceofEnergy;
        this.priceofwater = priceofwater;
    }

    public void Updatebill(int newmeternumber, int newEnergyUse) {
        this.oldmeternumber = this.newmeternumber;
        this.oldEnergyUse = this.newEnergyUse;
        this.newmeternumber = newmeternumber;
        this.newEnergyUse = newEnergyUse;
    }

    public void input() {

        Scanner ent = new Scanner(System.in);
        System.out.println("Enter your ID first :");
        id = ent.nextInt();
        ent.nextLine();
        System.out.println("Enter Customer address:");
        address = ent.nextLine();
        System.out.println("Enter Water meter use new month:");
        newmeternumber = ent.nextInt();
        System.out.println("Enter your New month energy use :");
        newEnergyUse = ent.nextInt();

    }

    public void output() {
        System.out.println("Customer ID:" + id);
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

    public void Filestorage() {

    }

    public int CalWaterMeter() {
        return summeterwater = newmeternumber - oldmeternumber;
    }

    public int calElectricEnergy() {
        return sumEnergyUsed = newEnergyUse - oldEnergyUse;
    }

    public int ElectricPrice() {
        return sumElectric = sumEnergyUsed * priceofEnergy;
    }

    public int WaterMeterPrice() {
        return sumWater = summeterwater * priceofwater;
    }

    public int RenterBill() {
        return total = sumElectric + sumWater;
    }

    public void StoringOperation() {

        ArrayList<CreateBill> Renter = new ArrayList<CreateBill>();
        CreateBill renter = new CreateBill(935, 7647, 700, 1000);
        System.out.println("Welcome to Saren Electric - Water Billing System-->");
        System.out.println("Please fill the information here-->");
        renter.input();
        System.out.println("Here is this month bill-->");
        renter.output();
        Renter.add(renter);
        try {
            FileWriter writedata = new FileWriter(filename);
            for (CreateBill renterData : Renter) {
                writedata.write("Customer ID: " + renterData.id + "\n");
                writedata.write("Customer Address: " + renterData.address + "\n");
                writedata.write("Customer Old Meter Number: " + renterData.oldmeternumber + "\n");
                writedata.write("Customer New Meter Number: " + renterData.newmeternumber + "\n");
                writedata.write("Customer Old Energy Number: " + renterData.oldEnergyUse + "\n");
                writedata.write("Customer New Energy Number: " + renterData.newEnergyUse + "\n");
                writedata.write("Customer Calculate Water Meter Used: " + renterData.CalWaterMeter() + "\n");
                writedata.write("Customer Calculate Electric Energy Used: " + renterData.calElectricEnergy() + "\n");
                writedata.write("Customer Total Electric Bill: " + renterData.ElectricPrice() + "\n");
                writedata.write("Customer Total Water Bill: " + renterData.WaterMeterPrice() + "\n");
                writedata.write("Customer Total Bill this month: " + renterData.RenterBill() + "\n\n");

            }
            writedata.close();
            System.out.printf("Succesfully write to file");
        } catch (IOException e) {
            System.out.printf("error writing data to file " + e.getMessage().toString());
        }

//        Map<String, ArrayList<CreateBill>> Renters = new HashMap<>();
//        Renters.put("Febraury", Renter);
//
//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        String json = gson.toJson(Renters);
//        String filepath = "ElectricWaterBill.json";
//        try (FileWriter writeData= new FileWriter(filepath)){
//            writeData.write(json);
//            System.out.println("----Success");
//            writeData.close();
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }
    }
}
