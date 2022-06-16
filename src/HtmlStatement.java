import java.util.Enumeration;

public class HtmlStatement extends Statement {

 
    public String getFirstResult(Customer aCustomer) {
        return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
    }

    public String getFigures(Rental aRental) {
        return aRental.getMovie().getTitle()+ ": " + String.valueOf(aRental.getCharge()) + "<BR>\n";
    }

    public String getFooter1(Customer aCustomer){
        return "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
    }

    public String getFooter2(Customer aCustomer){
        return "On this rental you earned <EM>" + 
                String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                "</EM> frequent renter points<P>";
    }

}