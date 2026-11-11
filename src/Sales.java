public class Sales
{
    private String drinkName;
    private double drinkQ;
    private double drinkP;
    
    
    public Sales(String drinkName, double drinkQ, double drinkP)
    {
        this.drinkName=drinkName;
        this.drinkQ=drinkQ;
        this.drinkP=drinkP;
       
    }
    public void setSales(String drinkName, double drinkQ, double drinkP)
    {
        this.drinkName=drinkName;
        this.drinkQ=drinkQ;
        this.drinkP=drinkP;
       
    }
    public String getDrinkName(){return drinkName;}
    public double getDrinkQ(){return drinkQ;}
    public double getDrinkP(){return drinkP;}
    
    public String toString ()
    {
        return("Drink: "+drinkName+"\tPrice: "+drinkP+"\tQuantity Sold: "+drinkQ);
    }
}