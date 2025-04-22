import java.util.Scanner;
/**
 * Write a description of class InventoryManagement here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InventoryManagement
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class InventoryManagement
     */
    public InventoryManagement()
    {
        // initialise instance variables
        x = 0;
    }
    
    public static void main(String[] args)
    {
        String reloop;
        boolean productFound;
        String[] products={"Xbox","Socks","Earphones","Fan","Iphone"}; //Store product names
        double[] productPrice={120.5d,5000d,3400d,1200d,9000d}; // Store product prices
        int[] productQuantity={12,5,9,11,34}; //Store product quantity
        
        do
        {
        System.out.println("Inventory Management System");
        System.out.println("Menu");
        System.out.println("1) Display all products with prices and quantities");
        System.out.println("2) Search details about a product");
        System.out.println("3) Update the quantity of a product");
        Scanner optionScanner = new Scanner(System.in);
        System.out.println("Select a item from 1 to 3");
        int optionChoice = optionScanner.nextInt();
        switch(optionChoice)
        {
        case 1: 
            
            for(int i = 0; i<=products.length-1;i++)
            {
                System.out.println("Product: "+products[i]+"       "+"Product Price:   "+"$"+productPrice[i]+"       "+"Product Quantity:  "+productQuantity[i]);
                
            }
            
            break;
        case 2:
            System.out.println("The product names are");
            for(int i=0;i<=products.length-1;i++)
            {
                System.out.println(products[i]);
            }
            System.out.println("Enter the product name to display its detail");
            Scanner scanner1 = new Scanner(System.in);
            
            String searchProduct= scanner1.nextLine();
            productFound = false;
            for(int j =0;j<=products.length-1;j++)
            {
                if (products[j].equals(searchProduct)==true)
                {
                    System.out.println("Product Name: "+searchProduct);
                    System.out.println("Product Price: "+"$"+productPrice[j]);
                    System.out.println("Product Amount: "+productQuantity[j]);
                    
                    productFound=true;
                    break;
                    
                }
                
                
            }
            if (productFound == false)
            {
                System.out.println("No such product found. Please Try Again Later");
            }
            break;
        case 3:
             System.out.println("The product names are");
            for(int i=0;i<=products.length-1;i++)
            {
                System.out.println(products[i]);
            }
            Scanner abx = new Scanner(System.in);
            
            System.out.println("Enter the product name to update the stock");
            String updateProductName=abx.nextLine();
            System.out.println("Enter the amount of stock to add");
            int stockUpdateValue = abx.nextInt();
            productFound = false;
            for(int i = 0;i<=products.length-1;i++)
            {
                if(products[i].equals(updateProductName)==true)
                {
                    productFound = true;
                    productQuantity[i]=productQuantity[i]+stockUpdateValue;
                    System.out.println("The product stock is updated");
                    System.out.println("The new stock for "+updateProductName+" is "+" "+productQuantity[i]);
                    
                    
                    break;
        
                }
                
            }
            if (productFound == false)
            {
                System.out.println("No such product found. Please try again later");
            }
            break;
            default:
                System.out.println("No such option exists. Try again later");
            
            
            
        }
        Scanner x1= new Scanner(System.in);
        System.out.println("Do you want to continue?(Y/N)");
        reloop = x1.nextLine();
        
        
        
        
    } while(reloop.equals("Y"));
    System.out.println("Bye");
    
    }
 
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
