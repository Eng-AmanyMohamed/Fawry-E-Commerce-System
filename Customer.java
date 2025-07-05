public class Customer {
    public String Name;
    public double Balance;
    public Customer(String name, double balance)
    {
        Name=name;
        Balance=balance;
    }
    public double getBalance()
    {
        return Balance;
    }
    public void deduct(double amount)
    {
        Balance-=amount;
    }
    public boolean canAfford(double amount) 
    { 
        return Balance >= amount;
    }

}
