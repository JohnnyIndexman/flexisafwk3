public class Main {
    public static void main(String[] args) {
        clothSales shirt = new clothSales("Shirt", true, "M", 10);
        clothSales pants = new clothSales("Pants", false, "L", 0);

        System.out.println("Shirt:");
        shirt.checkAvailablity();
        System.out.println("Pants:");
        pants.checkAvailablity();
    }
}
