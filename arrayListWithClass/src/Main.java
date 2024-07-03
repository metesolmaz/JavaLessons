import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        Customer mete = new Customer(1,"Mete","Solmaz");
        customers.add(mete);
        customers.add(new Customer(2,"Ahmet","Yılmaz"));
        customers.add(new Customer(3,"Faruk","Hazar"));

        customers.remove(mete);
        for(Customer customer : customers){
            System.out.println(customer.firstName);
        }
    }
}