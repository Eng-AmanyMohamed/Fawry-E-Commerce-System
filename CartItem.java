public class CartItem {
    private Product product;
    private int Quantity;
    public CartItem(Product product,int Qty)
    {
        this.product=product;
        Quantity=Qty;
    }
    public Product getProduct() { return product; }
    public int getQuantity() { return Quantity; }
    public double getTotalPrice() { return product.getPrice() * Quantity; }
        
    }

