package invoiceitem;

public class InvoiceTest {

    public static void main(String[] args) {
        // Invoice constructors for 2 different invoices
        InvoiceItem Invoice1 = new InvoiceItem(1, "12GB capacity harddisk drive (internal)", 9, 541.00); // creating a new instance of the object invoice														
        InvoiceItem Invoice2 = new InvoiceItem(2, "SDRAM memory upgrade module, 16 MB", 12, 111.00);
        
        // Prints invoice, sets quantity to 4, sets unit price to 40.00, then prints the updated invoice data
        Invoice1.printInvoice(); 
        Invoice1.setQuantity(4); 
        Invoice1.setUnitPrice(40.00);
        Invoice1.printInvoice(); 
        Invoice2.printInvoice();

        // Prints out the amount of invoices which is stored in counter
        System.out.println("Amount of invoices: " + InvoiceItem.counter);
    }

}
