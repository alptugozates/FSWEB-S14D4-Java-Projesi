public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[]{
                new Chocolate("Milk Chocolate", 2.99, "Smooth and creamy", "Hershey's"),
                new Coke("Carbonated Drink", 1.49, "Refreshing cola", "Classic"),
                new Bread("Whole Wheat Bread", 3.49, "Healthy choice", true)
        };

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
    for (ProductForSale product : products) {
        product.showDetails();
    }
    }
}