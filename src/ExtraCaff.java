
public class ExtraCaff extends CoffeeBean
{
    private double addiPrice;
    
    public ExtraCaff(double w, double p, double a)
    {
        super(w,p);
        addiPrice=a;
    }
    public void setExtraCaff()
    {
        addiPrice=30.00;
    }
    public double getWeight(){return weight;}
    public double getPrice(){return price;}
    public double getAddiPrice(){return addiPrice;}
    
    public double calcPrice()
    {
        return (super.calcPrice()+addiPrice);
    }
    
    public String toString()
    {
        return(super.toString()+"Extra Caffein charge:"+addiPrice);    
    }
}