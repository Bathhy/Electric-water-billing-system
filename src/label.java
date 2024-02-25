import javax.swing.*;

public class label {
    public static void main(String[] args) {
        JFrame f = new JFrame("Electric-Water Billing System");
        JLabel l1,l2;
        l1 = new JLabel("Electric-Water Billing System");
        l1.setBounds(50,50, 200,30);
        l2 = new JLabel("Enter Renter Name");
        l2.setBounds(50,100, 200,30);
        f.add(l1); f.add(l2);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
