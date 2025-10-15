// File for your Coder Cafe code!
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class CoderCafe {
    public static void main(String args[]) {
        //variables for all the numbers of drinks
        int matchaQuantity = 2;
        int latteQuantity = 4;
        int cappuccinoQuantity = 3;
        int hotChocolateQuantity = 1;
        //variables for price of drinks
        double matchaPrice = 4.50;
        double lattePrice = 5.30;
        double cappuccinoPrice = 3.75;
        double hotChocolatePrice = 4.80;
        //variables for total price of each drink (drink number times drink cost)
        double matchaTotal = matchaQuantity * matchaPrice;
        double latteTotal = latteQuantity * lattePrice;
        double cappuccinoTotal = cappuccinoQuantity * cappuccinoPrice;
        double hotChocolateTotal = hotChocolateQuantity * hotChocolatePrice;
        //variable for total (all total drink costs added together)
        double subTotal = hotChocolateTotal+ matchaTotal+ cappuccinoTotal+ latteTotal;
        //variable for sales tax (the total times 8.875%)
        double salesTax = (int)((subTotal *.08875)*100)/100.0;
        //variable for service fee which is always the same
        double serviceFee = 1.21;
        //variable for total number of items
        int numberItems = matchaQuantity + latteQuantity + cappuccinoQuantity + hotChocolateQuantity;
        //variable for coder cafe fee(subtotal divided by the total number of items and then rounded down to the nearest center)
        double coderCafeFee = (int)((subTotal%numberItems)*100)/100.0;
        //variable for total (everything added together)
        double total = subTotal + coderCafeFee + serviceFee + salesTax;


//all * are for borders and \t are for spacing
System.out.println("*************************************");
System.out.println("*\t\tWelcome to Orli's Cafe\t\t*");
//input the time and date
LocalDateTime Datetime = LocalDateTime.now();
DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
String formattedDate = Datetime.format(myFormatObj);
System.out.println("*\t\t " +formattedDate +"\t\t*");


        System.out.println("*\t\t\t\t\t\t\t\t\t*");
// list the number of each item and the price
        System.out.printf("* %d X Iced Matcha\t\t\t$ %.2f  *",matchaQuantity, matchaTotal);
        System.out.println();
        System.out.printf( "* %d X Iced Latte \t\t\t$ %.2f *", latteQuantity, latteTotal );
        System.out.println();
        System.out.printf("* %d X Cappuccino\t\t\t$ %.2f *", cappuccinoQuantity,  cappuccinoTotal );
        System.out.println();
        System.out.printf("* %d X Hot Chocolate \t\t$ %.2f  *",hotChocolateQuantity, hotChocolateTotal);
        System.out.println();

        //this is used for spacing with the border
        System.out.println("*\t\t\t\t\t\t\t\t\t*");
        //this is for all the calculations with the prices
        System.out.printf("* Subtotal:" + "\t\t\t\t\t$ %.2f *", subTotal);
        System.out.println();
        System.out.printf("* Sales tax:\t\t\t\t$ %.2f  *", salesTax) ;
        System.out.println();
        System.out.printf("* Service Fee: \t\t\t\t$ " + serviceFee + "  *");
        System.out.println();
        System.out.printf("* Coder Cafe Fee: \t\t\t$ %.2f  *", coderCafeFee);
        System.out.println();
        System.out.println("*\t\t\t\t\t\t\t\t\t*");
        System.out.printf("* Total: \t\t\t\t\t$%.2f  *", total);
        System.out.println();
        //closing message
        System.out.println("*\t\t Have a great day :)\t\t*");
        //rest of the border
        System.out.println("*************************************");

    }
}