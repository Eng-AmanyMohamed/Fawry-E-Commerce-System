
//physical devices requires shipping but has no expiry date

import Interface.Shippable;

public class PhysicalProducts extends Product implements Shippable{
    private double Weight;
    public PhysicalProducts(String name, double price,int quantity,double weight) {
    super(name, price, quantity);
    Weight=weight;
 }
 @Override
 public double getWeight()
 {
    return Weight;
 }
    
}
