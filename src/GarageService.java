// this class interact all the class car customer invoice serves
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class GarageService {
    private HashMap<String,Customer> customerMap;
    private List<Service> aviableService ;

    public GarageService() {
        this.customerMap = new HashMap<>();
        this.aviableService = new ArrayList<>();
        loadService();
    }
    public void loadService(){
        aviableService.add(new Service("Car Wash",500));
        aviableService.add(new Service("Oil Change",1000));
        aviableService.add(new Service("Repair",478));
        aviableService.add(new Service("Wheel Alignment",500));
        aviableService.add(new Service("Tyre Change",2000));
        aviableService.add(new Service("Battery Replacement", 3000));
        aviableService.add(new Service("Engine Tune-Up", 4500));
        aviableService.add(new Service("Brake Pad Replacement", 2200));
        aviableService.add(new Service("AC Service", 2500));
        aviableService.add(new Service("Headlight Replacement", 800));
        aviableService.add(new Service("Radiator Flush", 1800));
        aviableService.add(new Service("Fuel System Cleaning", 2700));
        aviableService.add(new Service("Suspension Check", 1600));
        aviableService.add(new Service("Spark Plug Replacement", 900));
        aviableService.add(new Service("Exhaust System Repair", 3500));

    }
    public void addCustomer(String name,String phoneNumber,String carNumber ,String modelNumber){
        Car car = new Car(carNumber, modelNumber);
        Customer customer = new Customer(name,phoneNumber,car) ;
        customerMap.put(carNumber,customer) ;
        System.out.println("Customer added Successfully");
    }
    public void createInvoice(String carNumber)
    {
        if (!customerMap.containsKey(carNumber)){
            System.out.println("Car Not Exist");
            return;
        }

        Scanner sc = new Scanner(System.in);
        Customer customer = customerMap.get(carNumber) ;
        Invoice invoice = new Invoice(customer);


        System.out.println("Available Services: ");
        for (int i = 0; i < aviableService.size(); i++) {
            System.out.println((i+1)+". Service Name:"+aviableService.get(i).getSerivceName()+" ₹:"+aviableService.get(i).getPrice());
        }
        while (true){
            System.out.println("Enter Service Number to Add ( 0 to finish):");
            int choice =sc.nextInt() ;
            if (choice ==0) break; ;
            if (choice > 0 && choice <= aviableService.size()){
                invoice.addService(aviableService.get(choice-1));
                System.out.println("Service done");
            }
            else {
                System.out.println("Invalid Choice");

            }
        }
        invoice.printInvoice();
    }
}
