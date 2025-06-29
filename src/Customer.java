public class Customer {
    private String name ;

    private String contactNumber ;

    private Car car ;

    public Customer(String name,String contactNumber,Car car){
        this.contactNumber = contactNumber ;
        this.name = name ;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public Car getCar() {
        return car;
    }

}
