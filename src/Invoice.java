import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private Customer customer;

    private List<Service> serviceList ;

    private double totalAmount ;

    public Invoice(Customer customer) {
        this.customer = customer;
        this.serviceList = new ArrayList<>();
        this.totalAmount = 0;
    }

    // we have the multiple service we are add at the time of the invoice
    public void addService(Service service){
        serviceList.add(service);

        // after adding the service add the price of service
        totalAmount+= service.getPrice();

    }
    public void printInvoice(){
        System.out.println("-------------Invoice Details---------");
        System.out.println();
        System.out.print("Customer Details:"+customer.getName()+" | Phone:"+customer.getContactNumber());

        // we can don't print the car because it is the object
        System.out.println(" | Car Details: "+customer.getCar().getCarNumber()+" | Model Number:"+customer.getCar().getModelNumber());

        System.out.println("Services Details......");
        // we have a list of services
        for (int i = 0; i < serviceList.size(); i++) {
            System.out.println(i+1+" "+serviceList.get(i).getSerivceName()+": ₹"+serviceList.get(i).getPrice());
        }

        System.out.println("Total Amount: "+"₹"+totalAmount);
        System.out.println();
    }
}
