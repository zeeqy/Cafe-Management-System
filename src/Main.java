import java.util.Scanner;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner scanner = new Scanner(System.in);
        char again;

        // Prompt the user for admin username and password
        System.out.println("Enter Admin Username:");
        String username = scanner.nextLine();

        System.out.println("Enter Admin Password:");
        String password = scanner.nextLine();
        
        String correctUsername = "admin123";
        String correctPassword = "password123";
        
        // Check if the input credentials are correct
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login Successful!");
            System.out.println("Welcome!");
        
        do{
            System.out.println("Please select one: ");
            System.out.println("1.Order Coffee Bean");
            System.out.println("2.Check Total Sales");
            int task = scanner.nextInt();
            
            switch(task){
                case 1: 
            
            
            String beanname=" ";
            String beantype=" ";
            
            System.out.println("--Choose Your Desire Bean--");
            System.out.println("1.Arabica");
            System.out.println("2.Robusta" );
            System.out.println("3.Typica" );
            int choice = scanner.nextInt();
            
            double weight;
            double price=0;
            System.out.println("Enter weight in kg:");
            weight = scanner.nextDouble();
            
            CoffeeBean arabica=null;
            CoffeeBean robusta=null;
            CoffeeBean typica=null;
            
            
            switch (choice) {
            case 1:
                arabica = new CoffeeBean(weight, 100.0);
                beanname="Arabica";
                price=100.0;
                break;
            case 2:
                robusta = new CoffeeBean(weight, 80.0);
                beanname="Robusta";
                price=80.0;
                break;
            case 3:
                typica = new CoffeeBean(weight, 90.0);
                beanname="Typica";
                price=90.0;
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(0);
        }
        
        char newChoice = 'N';
            System.out.print("Do you want to change the bean type? (Y/N): ");
        char changeBean = scanner.next().charAt(0);
            ExtraCaff ExtraPrice = null; 
            Decaffein DecaffPrice = null;
        
            if (changeBean == 'Y' || changeBean == 'y') {
            System.out.println("Choose the new Coffee Bean Type:");
            System.out.println("E. Extra Caffeine");
            System.out.println("D. Decaffein");
            newChoice = scanner.next().charAt(0);
            
            if (newChoice == 'E' || newChoice == 'e') {
                 ExtraPrice = new ExtraCaff(weight, price, 30.0);
                beantype="Extra Caffein";
            } 
            else if (newChoice == 'D' || newChoice == 'd') {
                DecaffPrice= new Decaffein(weight, price, 20.0);
                beantype="Decaff";
            }
            else
                beantype="Normal";
        }
        System.out.println("===YOUR ORDERED DETAIL==");
        System.out.println("Bean Name: "+beanname);
        System.out.println("Bean Type: "+beantype);
        if (changeBean == 'Y' || changeBean == 'y'){
            if (newChoice == 'E' || newChoice == 'e'){
                System.out.println("Total Price: "+ExtraPrice.calcPrice());
            }
            else
                System.out.println("Total Price: "+DecaffPrice.calcPrice());
        
        }
        
        else
            switch(choice){
                case 1:
                    System.out.println("Total Price: "+arabica.calcPrice());
                    break;
                case 2:
                    System.out.println("Total Price: "+robusta.calcPrice());
                    break;
                case 3:
                    System.out.println("Total Price: "+typica.calcPrice());
                    break;
                    
                }
        System.out.println("===========================");
        break;
        case 2:
                
        System.out.println("==BijiKopi Sales In Month==");
                
        try{
            FileReader fr = new FileReader("totalsales.txt");
            BufferedReader br = new BufferedReader(fr);
            
            Sales []drink= new Sales[20];
            String s=null;
            String drinkName;
            double drinkQ=0;
            double drinkP=0;
            
            int count=0;
            s= br.readLine();
            while (s !=null){
                StringTokenizer st=new StringTokenizer(s,"*");
                drinkName= st.nextToken();
                drinkQ=Double.parseDouble(st.nextToken());
                drinkP=Double.parseDouble(st.nextToken());
                
                drink[count]=new Sales(drinkName,drinkQ,drinkP);
                drink[count].setSales(drinkName,drinkQ,drinkP);
                
                s= br.readLine();
                count++;
            }
            double totalS=0;
            for(int i=0;i<count;i++){
                double drinksale;
                drinksale=drink[i].getDrinkQ()*drink[i].getDrinkP();
                System.out.println(drink[i].toString()+"\t Drink Sale: "+drinksale);
                totalS +=drinksale;
            }
            System.out.println("Total Sale: "+totalS);
            System.out.println("===========================");
        }
    catch(EOFException eof){
        System.out.println("Problem: "+eof.getMessage());
    }
    catch(FileNotFoundException e){
        System.out.println("Problem: "+e.getMessage());
    }
    catch(IOException ioe){
        System.out.println("Problem: "+ioe.getMessage());
    }
    finally{
        System.out.println("End of the program");
    }
    break;
    }
    System.out.print("Do you want to continue? (y/n): ");
    again = scanner.next().charAt(0);

 }while(again != 'n' && again != 'N');
}
        else {
            System.out.println("Invalid username or password. Login failed.");
        }
    }       
}