public class CoffeeBean
{
    protected double weight;
    protected double price;
    protected double totalP;
    
    
    public CoffeeBean(double w, double p) {
        weight=w;
        price=p;
        
    }
    
    public void setCoffeeBean(){
        weight=0.0;
        price=0.00;
    }
    
    public double getWeight(){return weight;}
    public double getPrice(){return price;}
    
    public double calcPrice(){
        double totalP;
        totalP=(weight*price);
        return totalP;
    }
    
    public String toString(){
        return("\nCoffee Bean Type: Normal \nWeight: "+weight+"\nPrice: "+price+"\nQuantity: "+"\nTotal Price: "+totalP);
    }
}