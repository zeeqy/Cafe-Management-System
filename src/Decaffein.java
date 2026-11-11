public class Decaffein extends CoffeeBean
{
    private double extra;
    
    public Decaffein(double w, double p, double e)
    {
        super(w,p);
        extra=e;
    }
    public void setDecaffein()
    {
        extra=20.00;
    }
    public double getWeight(){return weight;}
    public double getPrice(){return price;}
    
    public double getExtra(){return extra;}
    
    public double calcPrice()
    {
        return(super.calcPrice()+extra);
    }
    
    public String toString()
    {
        return(super.toString()+"Decaffein charge:"+extra);    
    }
    
}