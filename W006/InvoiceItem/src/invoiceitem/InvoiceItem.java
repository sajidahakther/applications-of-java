package invoiceitem;

import java.util.*;

public class InvoiceItem {

    // Creating the variables ID, description, quantity, unit price and counter
    int ID;
    String description;
    int quantity;
    double unitPrice;
    static int counter = 0;

    /* Created a four parameter constructor function to initialise all the four instance variables.
    The counter is incremented for each invoice item. */
    InvoiceItem(int ID, String description, int quantity, double unitPrice) {
        counter++;

        // Using 'this' to set the arguements as the class variables
        this.ID = ID;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    //GETTERS: This method returns the invoice ID, description, quantity and unit price
    public int getID() {
        return ID;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    /* SETTERS: this method is used to set the quantity of items in an invoice, and the unit price value of the invoice
    the arguement of the method is set. The methods argument is set to the class' quantity and unit price. */
    public void setQuantity(int quantity) throws InputMismatchException {
        this.quantity = quantity; 
    }
  
    public void setUnitPrice(double unitPrice) throws InputMismatchException {
        this.unitPrice = unitPrice; 
    }

    // Method toString prints the variables as a string, and returns the invoice information
    public String toString() {
        return "ID = " + ID + ", Description = " + description + ", Quantity = " + quantity + ",  Unit Price = " + unitPrice;
    }

    // Prints the toString method (invoice information)
    void printInvoice() {
        System.out.println(toString());
    }
}
