// File for your Coder Cafe code!
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class CoderCafe {
    public static void main(String args[]) {
        //variables for all the numbers of drinks
        int matcha = 2;
        int latte = 4;
        int cappuccino = 3;
        int hotChocolate = 1;
        //variables for price of drinks
        double matchaPrice = 4.50;
        double lattePrice = 5.30;
        double cappuccinoPrice = 3.75;
        double hotChocolatePrice = 4.80;
        //variables for total price of each drink (drink number times drink cost)
        double matchaTotal = matcha * matchaPrice;
        double latteTotal = latte * lattePrice;
        double cappuccinoTotal = cappuccino * cappuccinoPrice;
        double hotChocolateTotal = hotChocolate * hotChocolatePrice;
        //variable for total (all total drink costs added together)
        double subTotal = hotChocolateTotal+ matchaTotal+ cappuccinoTotal+ latteTotal;
        //variable for sales tax (the total times 8.875%)
        double salesTax = subTotal *.08875;
        //variable for service fee which is always the same
        double serviceFee = 1.21;
        //variable for total number of items
        int numberItems = matcha + latte + cappuccino + hotChocolate;
        //variable for coder cafe fee(subtotal divided by the total number of items and then rounded down to the nearest center)
        double coderCafeFee = (subTotal/numberItems)*((100)/100.0);
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
        System.out.printf("* " + matcha + " X Iced Matcha" + "\t\t\t$ %.2f", matchaTotal);
        System.out.println("  *");
        System.out.printf( "* "+ latte + " X Iced Latte" + "\t\t\t$ %.2f",  latteTotal );
        System.out.println(" *");
        System.out.printf("* "+ cappuccino + " X Cappuccino" + "\t\t\t$ %.2f",  cappuccinoTotal );
        System.out.println(" *");
        System.out.printf("* "+ hotChocolate + " X Hot Chocolate" +  "\t\t\t$ %.2f", hotChocolateTotal);
        System.out.println("  *");

        //this is used for spacing with the border
        System.out.println("*\t\t\t\t\t\t\t\t\t*");
        //this is for all the calculations with the prices
        System.out.printf("* Subtotal:" + "\t\t\t\t\t$ %.2f", subTotal);
        System.out.println(" *");
        System.out.printf("* Sales tax:" + ("\t\t\t\t$ %.2f"), salesTax) ;
        System.out.println("  *");
        System.out.printf("* Service Fee:" + ("\t\t\t\t$") + serviceFee);
        System.out.println("   *");
        System.out.printf("* Coder Cafe Fee:" + "\t\t\t$%.2f", coderCafeFee);
        System.out.println("   *");
        System.out.println("*\t\t\t\t\t\t\t\t\t*");
        System.out.printf("* Total: " + "\t\t\t\t\t$%.2f", total);
        System.out.println("  *");
        //closing message
        System.out.println("*\t\t Have a great day :)\t\t*");
        //rest of the border
        System.out.println("*************************************");

    }
}