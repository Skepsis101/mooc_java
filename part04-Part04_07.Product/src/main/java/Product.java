public class Product {
    private String nameProduct;
    private int quantityProduct;
    private double priceProduct;

    // construtor
    public Product(String initialName, double initialPrice, int initialQuantity) {
        nameProduct = initialName;
        quantityProduct = initialQuantity;
        priceProduct = initialPrice;
    }

    public void printProduct() {
        System.out.println(nameProduct + ", price " + priceProduct + ", " + quantityProduct + " unities");
    }
}
