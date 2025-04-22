import java.util.Scanner;

/**
 * Write a description of class InventoryManagementSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InventoryManagementSystem
{
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       String[] productname={"Shirt","Jacket","Shoes","SportsShoes","Underwear"};
       Double[] prices={550.00,460.00,900.00,1100.00,380.00};
       int[] quantities={20,40,50,70,90};
       System.out.println("Product in Inventory Management System= ");
        for(int j=0; j<productname.length;j++){
            System.out.printf("%d.%s , price=$%.2f, Qty=%d%n",j + 1,productname[j],prices[j],quantities[j]);
        }
        System.out.println("\n Enter a product Name from Inventory to Search= ");
        System.out.print("Choose option= ");
        String Search=sc.nextLine();
        boolean found = false;
        for (int j = 0; j < productname.length; j++){
            if(productname[j].equalsIgnoreCase(Search)){
                System.out.printf("found=%s , price=$%.2f , Qty: %d%n",productname[j],prices[j],quantities[j]);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.printf("Product is not found from Inventory in Retail Store!");
        }
        System.out.print("\nEnter product name to update quantity= ");
        String update =sc.nextLine();
        found = false;
        for (int j = 0; j < productname.length; j++){
            if(productname[j].equalsIgnoreCase(update)){
                System.out.print("Enter a quantity to add= ");
                int addQty = sc.nextInt();
                quantities[j] += addQty;
                System.out.printf("Updated quantity of %s: %d%n", productname[j], quantities[j]);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("Product quality is not found From Inventory in Retail Store!");
        }
  }
 }


