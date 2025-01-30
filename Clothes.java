class clothSales {
    private String cloth;
    private boolean isAvailable;
    private String size;
    private int quantity;

    //constructor
    public clothSales(String cloth, boolean isAvailable, String size, int quantity){
        this.cloth = cloth;
        this.isAvailable = isAvailable;
        this.size = size;
        this.quantity = quantity;
    }

    public void checkAvailablity(){
        System.out.println("Cloth: " + cloth);
        System.out.println("Size: " + size);
        if(isAvailable){
            System.out.println("Status: avalable");
            if(quantity > 0) {
                System.out.println("Stock: " + quantity + " pieces available");
            } else {
                System.out.println("Stock: Out of stock");
            }
        }
        else{
            System.out.println("Status: Not available");
        }
    }
}