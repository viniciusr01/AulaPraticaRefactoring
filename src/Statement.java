import java.util.Enumeration;

public abstract class Statement {

    public abstract String getFirstResult(Customer aCustomer);
    public abstract String getFigures(Rental aRental);
    public abstract String getFooter1(Customer aCustomer);
    public abstract String getFooter2(Customer aCustomer);

    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = getFirstResult(aCustomer);

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += getFigures(each);
        }
    
        result += getFooter1(aCustomer);
        result += getFooter2(aCustomer);
        
        return result;
    }

}