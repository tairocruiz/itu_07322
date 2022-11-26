/**
 * @author T.cruiz.
 * @since  Nov 2022.
 */ 

import invoice.Invoice;
import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        
        String ptNo, ptDesc;
        int items;
        float pri;

       try ( Scanner inter = new Scanner(System.in)){

            System.out.print("Enter an invoice part No : ");
            ptNo = inter.next();

            System.out.print("Enter an invoice part description : ");
            ptDesc = inter.next();

            System.out.print("Enter an invoice items quantity : ");
            items = inter.nextInt();

            System.out.print("Enter an item price : ");
            pri = inter.nextFloat();

       }
        
        //instanting an ob
        Invoice profoma = new Invoice(ptNo, ptDesc, items, pri);

        // do some discount when items exceed 20 items
        if (items >= 20)
            profoma.setItemQuantity(items - (items/10)); // you can use the other setters to learn more.
       
        System.out.println("\nInvoice Part No : " + profoma.getPartNumber());
        System.out.println("Invoice Part Description : " + profoma.getPartDesc());
        System.out.println("Invoice Item Quantity : " + profoma.getItemQuantity());
        System.out.println("Item price per each : " + profoma.getItemPrice());
        System.out.println("Invoice Grand total : " + profoma.getInvoiceAmount());
    }
    
}
