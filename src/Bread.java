public class Bread extends ProductForSale{
    private boolean isWholeWheat;

    public Bread(String type, double price, String description, boolean isWholeWheat) {
        super(type, price, description);
        this.isWholeWheat = isWholeWheat;
    }

    public boolean isWholeWheat() {
        return isWholeWheat;
    }

    @Override
    public void showDetails() {
        System.out.println("Bread Details:");
        System.out.println("Type: " + getType());
        System.out.println("Price: $" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Whole Grain: " + (isWholeWheat ? "Yes" : "No"));
    }
}
