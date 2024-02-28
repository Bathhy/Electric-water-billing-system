import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

class RenTer{
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

    public RenTer(int oldmeternumber, int oldEnergyUse, int priceofEnergy, int priceofwater) {
        this.oldmeternumber = oldmeternumber;
        this.oldEnergyUse = oldEnergyUse;
        this.priceofEnergy = priceofEnergy;
        this.priceofwater =priceofwater;
    }

    public void input(int id, String address, int newmeternumber, int newEnergyUse){
        this.id = id;
        this.address = address;
        this.newmeternumber= newmeternumber;
        this.newEnergyUse = newEnergyUse;
    }
    public String output(){
      return "Customer ID: " + id + "\n" +
              "Customer Address: " + address + "\n" +
              "Customer Old Meter Number: " + oldmeternumber + "\n" +
              "Customer New Meter Number: " + newmeternumber + "\n" +
              "Customer Old Energy Number: " + oldEnergyUse + "\n" +
              "Customer New Energy Number: " + newEnergyUse + "\n" +
              "Customer Calculate Water Meter Used: " + summeterwater + "\n" +
              "Customer Calculate Electric Energy Used: " + sumEnergyUsed + "\n" +
              "Customer Total Electric Bill: " + sumElectric + "\n" +
              "Customer Total Water Bill: " + sumWater + "\n" +
              "Customer Total Bill this month: " + total;
    }


    public void calculate(){
        summeterwater = newmeternumber - oldmeternumber;
        sumEnergyUsed = newEnergyUse - oldEnergyUse;
        sumElectric = sumEnergyUsed * priceofEnergy;
        sumWater = summeterwater  *priceofwater;
        total = sumElectric + sumWater;
    }




}
public class GuiVersion {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Electric - Water Billing System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5,2));

        JTextField idfield = new JTextField();
        JTextField addressfield = new JTextField();
        JTextField Newmeterfield = new JTextField();
        JTextField Newenergyfield = new JTextField();

        panel.add(new JLabel("Customer ID:"));
        panel.add(idfield);
        panel.add(new JLabel("Customer Address:"));
        panel.add(addressfield);
        panel.add(new JLabel("New month Water Meter:"));
        panel.add(Newmeterfield);
        panel.add(new JLabel("New month Electric Energy:"));
        panel.add(Newenergyfield);

        panel.add(new JLabel());

        JButton calbutton = new JButton("Calculate Bill");
        calbutton.setBounds(40,200,80,60);

        panel.add(calbutton);

        calbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(idfield.getText());
                String address = addressfield.getText();
                int meter = Integer.parseInt(Newmeterfield.getText());
                int energy = Integer.parseInt(Newenergyfield.getText());
                RenTer renter = new RenTer(917, 7511, 700, 1000);
                renter.input(id, address, meter, energy);
                renter.calculate();

                String bill = renter.output();
                JOptionPane.showMessageDialog(frame , bill, "Bill Details", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        panel.add(calbutton);


        frame.add(panel);
        frame.setVisible(true);




    }
}
