/**
 * @author T.cruiz.
 * @since  Nov 2022.
 */ 

class Invoice{

    String partNo;
    String partDesc;
    int itemQuantity;
    float itemPriceEach;

    /**
     * @constructor
     */
    public Invoice(String pn, String pd, int iq, float ip) {
        partNo = pn;
        partDesc = pd;
        itemQuantity = iq;
        itemPriceEach = ip;
    }

    /**
     * @methods for part number.
     */
    public String getPartNumber() {
        return partNo;
    }
    public void setPartNumber(String num) {
        partNo = num;
    }

    /**
     * @methods for part descriptions.
     */
    public String getPartDesc() {
        return partDesc;
    }
    public void setPartDesc(String desc) {
        partDesc = desc;
    }


    /**
     * @methods for item quantity.
     */
    public int getItemQuantity() {
        return itemQuantity;
    }
    public void setItemQuantity(int quantity) {
        itemQuantity = quantity;
    }

    /**
     * @methods for item price.
     */
    public double getItemPrice() {
        return itemPriceEach;
    }
    public void setItemPrice(float price) {
        itemPriceEach = price;
    }

    /**
     * @method get the total amount.
     */
    public double getInvoiceAmount() {
        if ((itemQuantity*itemPriceEach) < 0)
            return 0;
        else
            return (itemQuantity*itemPriceEach);
    }
}

public class InvoiceTest {
    public static void main(String[] args) {
        
        Invoice profoma = new Invoice("1001", "For travel", 12, 3);
        
        System.out.println("Invoice Part No : " + profoma.getPartNumber());
        System.out.println("Invoice Part Description : " + profoma.getPartDesc());
        System.out.println("Invoice Item Quantity : " + profoma.getItemQuantity());
        System.out.println("Item price per each : " + profoma.getItemPrice());
        System.out.println("Invoice Grand total : " + profoma.getInvoiceAmount());
    }
    
}
