package exe1;

public class CarItem {
    private int quantity;
    private Product product;

    public CarItem() {
    }

    public CarItem(int quantity, Product product) {
        this.setQuantity(quantity);
        this.setProduct(product);
    }

    public int getQuantity() {
        return quantity;
    }

    public final void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public final void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "\nCarItem [quantity=" + quantity + ", product=" + product + "]";
    }

}
