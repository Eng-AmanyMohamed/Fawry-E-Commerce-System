import java.util.ArrayList;
import java.util.List;

public class Cart {
   private List<CartItem> items = new ArrayList<>();

    public void add(Product product, int quantity)
    { 
       if(!product.isAvailable(quantity))
       {
        System.out.println(product.getName()+" is out of stock ");
       }
       if(product instanceof FoodProducts && ((FoodProducts)product).IsExpired())
       {
        System.out.println(product.getName() + " is expired");
       }
       items.add(new CartItem(product, quantity));
       System.out.println(quantity + "x " + product.getName() + " added to cart.");

    }
    public List<CartItem> getItems()
    {
       return items;
    }
    public boolean isEmpty() 
    { 
        return items.isEmpty();
    }
     public void clear() 
    {
        items.clear();
    }
}

