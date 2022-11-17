import model.Order;
import model.Product;
import model.User;

public class Main {
    public static void main(String[] args) {

        User first = new User("Ram", 90909000);
        User second = new User("Hari", 9809090);
        User third = new User("Steve", 9786090);

        Product p1 = new Product("Jacket", 0001, 9000, "North_face", "Sweater made up of pure silk all the way from USA");
        Product p2 = new Product("Shirt", 0002, 3000, "Levis", "Cotton tshirt perfect for the upcoming summer");
        Product p3 = new Product("Pant", 0003, 2000, "Gucci", "Pants with aesthetic designs made from best material");
        p3.print_format();

        Order o1=new Order(0001,1,2000,10);
        Order o2=new Order(0002,3,5000,2);

        o2.total_amt(20);
    }
}
