public class Service {
    private String serivceName;

    private double price ;


    public Service(String serviceName , float price){
        this.serivceName = serviceName ;
        this.price = price ;
    }

    public String getSerivceName() {
        return serivceName;
    }

    public double getPrice() {
        return price;
    }

}
