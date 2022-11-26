/**
 * @author T.cruiz.
 * @since  Nov 2022.
 */ 

package invoice;

public class Invoice{

    String partNo;
    String partDesc;
    int itemQuantity;
    float itemPriceEach;

    /**
     * @constructors
     * @01 for Instanting arguments.
     */
    public Invoice(String pn, String pd, int iq, float ip) {
        partNo = pn;
        partDesc = pd;
        itemQuantity = iq;
        itemPriceEach = ip;
    }

    // /**
    //  * @constructors
    //  * @02 for Instanting no-arguments.
    //  */
    // public Invoice() {

    // }

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