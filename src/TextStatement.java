import java.util.Enumeration;

public class TextStatement extends Statement {

    
    public String getFirstResult(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    public String getFigures(Rental aRental) {
        return "\t" + aRental.getMovie().getTitle()+ "\t" + String.valueOf(aRental.getCharge()) + "\n";
    }

    public String getFooter1(Customer aCustomer){
        return "Amount owed is " +
                String.valueOf(aCustomer.getTotalCharge()) + "\n";
    }

    public String getFooter2(Customer aCustomer){
        return "You earned " +
                String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                " frequent renter points";
    }
}