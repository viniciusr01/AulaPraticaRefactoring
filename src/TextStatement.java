import java.util.Enumeration;

public class TextStatement extends Statement {

    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = getFirstResult(aCustomer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();

            //show figures for this rental
            result += getFigures(each);
        }
        //add footer lines
        result += getFooter1(aCustomer);
        result += getFooter2(aCustomer);
        return result;
    }


    private String getFirstResult(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    private String getFigures(Rental aRental) {
        return "\t" + aRental.getMovie().getTitle()+ "\t" + String.valueOf(aRental.getCharge()) + "\n";
    }

    private String getFooter1(Customer aCustomer){
        return "Amount owed is " +
                String.valueOf(aCustomer.getTotalCharge()) + "\n";
    }

    private String getFooter2(Customer aCustomer){
        return "You earned " +
                String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                " frequent renter points";
    }
}