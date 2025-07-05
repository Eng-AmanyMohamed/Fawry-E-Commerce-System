// Helper class to include quantity when shipping
import Interface.Shippable;
public class ShippableItem implements Shippable{
        private Shippable product;
        private int quantity;

        public ShippableItem(Shippable product, int quantity) {
            this.product = product;
            this.quantity = quantity;
        }

        @Override
        public String getName() {
            return quantity + "x " + product.getName();
        }
       @Override
        public double getWeight() {
            return product.getWeight() * quantity;
        }

        public double getUnitWeight() {
            return product.getWeight();
        }
}
