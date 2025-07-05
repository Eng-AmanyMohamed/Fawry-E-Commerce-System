// Shipping Service accepts list of shippable objects

import java.util.List;

public class ShippingService {
   private double ShippingFees;
   public ShippingService()
   {
    ShippingFees = 30.0;
   } 
   public double getShippingFees()
   {
    return ShippingFees;
   }
   public static void ship(List<ShippableItem> shippables) {
            System.out.println("** Shipment notice **");
            double totalWeight = 0;
            for (ShippableItem s : shippables) {
                System.out.printf("%s %.0fg\n", s.getName(), s.getUnitWeight() * 1000); // kg to grams
                totalWeight += s.getWeight();
            }
            System.out.printf("Total package weight %.1fkg\n", totalWeight);
        }
}
