public class Car {
    private String carNumber ;
    private String modelNumber;


    public Car(String carNumber,String modelNumber){
        this.carNumber = carNumber ;
        this.modelNumber = modelNumber ;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }
}
