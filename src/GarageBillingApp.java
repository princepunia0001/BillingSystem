import java.util.Scanner;

// class interact with the garage service
public class GarageBillingApp {
    public GarageBillingApp(){

    }
    public static void main(String[] args) {
        GarageService garageService = new GarageService();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("----------Amit Car Service Center---------");
            System.out.println("1. Add Customer");
            System.out.println("2. Offer Service");
            System.out.println("3. Exist");

            System.out.println("Enter Your Choice");

                int choice = sc.nextInt();

                sc.nextLine();
                switch (choice) {
                    case 1:
                        System.out.println("Enter Customer Name:");
                        String name = sc.nextLine();
                        System.out.println("Enter Phone Number:");
                        String phoneNumber = sc.nextLine();
                        System.out.println("Enter CarNumber:");
                        String carNumber = sc.nextLine();
                        System.out.println("Enter CarModel");
                        String carModel = sc.nextLine();
                        garageService.addCustomer(name, phoneNumber, carNumber, carModel);
                        break;
                    case 2:
                        System.out.println("Enter CarNumber");
                        String carNo = sc.nextLine();
                        garageService.createInvoice(carNo);
                        break;
                    case 3:
                        System.out.println("Existing---Thank You");
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid Choice Try Again");
                }

        }
    }
}