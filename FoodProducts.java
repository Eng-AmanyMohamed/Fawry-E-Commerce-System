// Expirable product like Cheese or Biscuits

import java.time.LocalDate;

import Interface.Expirable;
import Interface.Shippable;

public class FoodProducts extends Product implements Expirable,Shippable{
 private LocalDate ExpiryDate;
 private double Weight;

 public FoodProducts(String name, double price, int quantity,double weight, LocalDate expiryDate) {
    super(name, price, quantity);
    ExpiryDate = expiryDate;
    Weight=weight;
 }
 @Override
 public boolean IsExpired()
 {
    return LocalDate.now().isAfter(ExpiryDate); 
 }
 @Override
 public double getWeight()
 {
    return Weight;
 }
    
}
