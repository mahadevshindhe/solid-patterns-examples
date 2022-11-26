package solid.interfaceseggregation;

import java.util.Date;
import java.util.List;

public class CustomerTransaction implements Accounting, Reporting {

    private List<Product> products;

    private Customer customer;

    public CustomerTransaction(Customer customer, List<Product> products) {
        this.products = products;
        this.customer = customer;
    }

    @Override
    public void prepareInvoice() {
        System.out.println("invoice prepared");
    }

    @Override
    public void chargeCustomer() {
        System.out.println("charged the customer");
    }

    @Override
    public String getName() {
        return customer.getName();
    }

    @Override
    public Date getDate() {
        return new Date();
    }

    @Override
    public String productBreakDown() {
        String reportListing = null;
        for (Product product : products) {
            reportListing = product.getProductName();
        }
        return reportListing;
    }
}
