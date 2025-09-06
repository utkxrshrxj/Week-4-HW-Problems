public class FoodOrder {
    private String customerName;
    private String foodItem;
    private int quantity;
    private double price;
    private static final double FIXED_RATE = 50.0;
    
    // Default constructor
    public FoodOrder() {
        this.customerName = "Unknown";
        this.foodItem = "Unknown";
        this.quantity = 0;
        this.price = 0.0;
    }
    
    // Constructor with food item
    public FoodOrder(String foodItem) {
        this.customerName = "Unknown";
        this.foodItem = foodItem;
        this.quantity = 1;
        this.price = FIXED_RATE;
    }
    
    // Constructor with food item and quantity
    public FoodOrder(String foodItem, int quantity) {
        this.customerName = "Unknown";
        this.foodItem = foodItem;
        this.quantity = quantity;
        this.price = quantity * FIXED_RATE;
    }
    
    // Constructor with all details
    public FoodOrder(String customerName, String foodItem, int quantity, double price) {
        this.customerName = customerName;
        this.foodItem = foodItem;
        this.quantity = quantity;
        this.price = price;
    }
    
    // Print bill method
    public void printBill() {
        System.out.println("=== FOOD ORDER BILL ===");
        System.out.println("Customer: " + customerName);
        System.out.println("Food Item: " + foodItem);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + price);
        System.out.println("=====================");
    }
    
    public static void main(String[] args) {
        // Create orders using different constructors
        FoodOrder order1 = new FoodOrder();
        FoodOrder order2 = new FoodOrder("Pizza");
        FoodOrder order3 = new FoodOrder("Burger", 3);
        FoodOrder order4 = new FoodOrder("John Doe", "Pasta", 2, 120.0);
        
        // Print all bills
        order1.printBill();
        order2.printBill();
        order3.printBill();
        order4.printBill();
    }
}