import java.util.ArrayList;
import java.util.List;
import Interface.Shippable;

public class CheckoutService {
    private ShippingService shippingservice;
    public CheckoutService() {
        this.shippingservice = new ShippingService();
    }
    public void checkout(Customer cust,Cart cart)
    {
      if(cart.isEmpty())
      {
        System.out.println("Cart is empty!!");
        return;
      }
      double subtotal=0;
      double shippingWeight=0;
       List<ShippableItem> shippables = new ArrayList<>();
       for (CartItem item : cart.getItems()) {
                Product p = item.getProduct();
                subtotal += item.getTotalPrice();
                if (p instanceof Shippable) {
                     shippables.add(new ShippableItem((Shippable) p, item.getQuantity()));
                    shippingWeight += ((Shippable) p).getWeight() * item.getQuantity();
                }
                
            }
            double shippingFees = shippingWeight > 0 ? shippingservice.getShippingFees() : 0;
            double totalAmount = subtotal + shippingFees;
            if (!cust.canAfford(totalAmount)) {
                System.out.println("Error: Insufficient balance.");
                return;
            }
            if (!shippables.isEmpty()) {

                ShippingService.ship(shippables);
            }
            cust.deduct(totalAmount);
                 
            System.out.println("**CheckOut receipt**");
            for (CartItem item : cart.getItems()) 
            {
                Product p = item.getProduct();
                System.out.printf("%dx %s %.0f\n", item.getQuantity(), p.getName(), item.getTotalPrice());
            }
            System.out.println("----------------------");
            System.out.printf("Subtotal %.0f\n", subtotal);
            System.out.printf("Shipping %.0f\n", shippingFees);
            System.out.printf("Amount %.0f\n", totalAmount);
            System.out.printf("Current Customer Balance after payment %.0f\n", cust.getBalance());

            // Deduct quantities from inventory
            for (CartItem item : cart.getItems()) {
                item.getProduct().reduceQty(item.getQuantity());
            }
            cart.clear();
        }
    }
