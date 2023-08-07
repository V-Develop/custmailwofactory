package customermailapplication;

import java.util.Scanner;

public class CustomerFactory {
    private Customer customer;

    public void getInputFromKeyBoard() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = inp.nextInt();
        switch(type) {
            case 1:
                this.getCustomerTypeFromUser("Regular");
                break;
            case 2:
                this.getCustomerTypeFromUser("Mountain");
                break;
            case 3:
                this.getCustomerTypeFromUser("Delinquent");
                break;
        }
    }

    public void getCustomerTypeFromUser(String customerType) {
        switch(customerType) {
            case "Regular":
                customer = new RegularCustomer();
                break;
            case "Mountain":
                customer = new MountainCustomer();
                break;
            case "Delinquent":
                customer = new DelinquentCustomer();
                break;
        }
    }

    public String generateMail() {
        return customer.createMail();
    }
}
