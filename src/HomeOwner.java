public class HomeOwner {
    public static final String filepath ="ElectricWaterBill.json";

    public static void main(String[] args) {
        CreateBill renter = new CreateBill(935, 7647, 700, 1000);
        renter.StoringOperation();
    }
}
