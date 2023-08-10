import java.util.Scanner;

class Product {
    private Long id;
    private String productName;
    private String supplierName;

    // Default constructor
    public Product() {
        this.id = 0L;
        this.productName = "";
        this.supplierName = "Nivas";
    }

    // 3-argument constructor
    public Product(Long id, String productName, String supplierName) {
        this.id = id;
        this.productName = productName;
        this.supplierName = supplierName;
    }

    // 2-argument constructor with default supplierName as "Nivas"
    public Product(Long id, String productName) {
        this.id = id;
        this.productName = productName;
        this.supplierName = "Nivas";
    }

    // Getter and setter methods
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    // Display method
    public void display() {
        System.out.println("Product Id is " + id);
        System.out.println("Product Name is " + productName);
        System.out.println("Supplier Name is " + supplierName);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the product id");
        Long id = scanner.nextLong();
        scanner.nextLine(); // Consume newline

        System.out.println("Enter the product name");
        String productName = scanner.nextLine();

        System.out.println("Is the product supplied by Nivas Suppliers? Type yes or no");
        String suppliedByNivas = scanner.nextLine().toLowerCase();

        Product product;

        if (suppliedByNivas.equals("yes")) {
            product = new Product(id, productName);
        } else {
            System.out.println("Enter the supplier name");
            String supplierName = scanner.nextLine();
            product = new Product(id, productName, supplierName);
        }

        product.display();
    }
}

