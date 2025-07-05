
import java.time.LocalDate;
public class main {
public static void main(String[] args){
        // Create products
        Product cheese = new FoodProducts("Cheese", 100, 10, 0.4,LocalDate.now().plusDays(7));
        Product biscuits = new FoodProducts("Biscuits",150, 5,0.7, LocalDate.now().plusMonths(2));
        Product tv = new PhysicalProducts("TV", 3000, 3, 10.5);
        Product scratchCard = new DigitalProducts("Mobile Scratch Card", 50, 100);

        //checkout
        CheckoutService checkoutservice = new CheckoutService();
        // Customer
        Customer customer = new Customer("Amany", 10000);
        // Cart
        Cart cart = new Cart();
        // Add items
       cart.add(cheese, 2);
       cart.add(tv, 3);
       cart.add(biscuits, 1);
       cart.add(scratchCard, 1);

       // Checkout
        checkoutservice.checkout(customer, cart);
    
}
}
