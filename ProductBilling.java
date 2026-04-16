// POLYMORPHISM EXAMPLE (Method Overloading)

public class ProductBilling {

    // Method to calculate bill for 1 product
    void bill(int price) {
        System.out.println("The total bill product (1) is " + price);
    }

    // Method to calculate bill for 2 products
    // Same method name but different number of parameters → Method Overloading
    void bill(int price1, int price2) {
        System.out.println("The total bill products (2) is " + (price1 + price2));
    }

    // Method to calculate bill for 3 products
    void bill(int price1, int price2, int price3) {
        System.out.println("The total bill products (3) is " + (price1 + price2 + price3));
    }

    public static void main(String[] args) {

        // Creating object of ProductBilling class
        ProductBilling pb = new ProductBilling();

        // Calling different overloaded methods
        pb.bill(10);           // Calls method with 1 parameter
        pb.bill(10, 20);       // Calls method with 2 parameters
        pb.bill(10, 20, 30);   // Calls method with 3 parameters
    }
}