import java.util.Enumeration;

public class HtmlStatement extends Statement {

    public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = getFirstResult(aCustomer);
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();

         //show figures for each rental
         result += getFigures(each);
      }

      //add footer lines
      result += getFooter1(aCustomer);
      result += getFooter2(aCustomer);
      return result;
    }


    private String getFirstResult(Customer aCustomer) {
        return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
    }

    private String getFigures(Rental aRental) {
        return aRental.getMovie().getTitle()+ ": " + String.valueOf(aRental.getCharge()) + "<BR>\n";
    }

    private String getFooter1(Customer aCustomer){
        return "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
    }

    private String getFooter2(Customer aCustomer){
        return "On this rental you earned <EM>" + 
                String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                "</EM> frequent renter points<P>";
    }




}