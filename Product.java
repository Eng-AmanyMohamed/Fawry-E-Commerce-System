 abstract class Product {

    protected String Name;
    protected double Price;
    protected int Quantity;
    public Product(String name, double price, int quantity) {
        Name = name;
        Price = price;
        Quantity = quantity;
    }
    public String getName()
    {
        return Name;
    }
    public double getPrice() {
        return Price;
    }
    public int getQuantity() {
        return Quantity;
    }
    public void reduceQty(int Qty)
    {
        Quantity-=Qty;
    }
    public boolean isAvailable(int requestedQty) {
            return requestedQty <= Quantity;
        }


}