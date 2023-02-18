import java.util.Vector;

/**
 * @ClassName: Customer
 * @Description: 顾客
 * @Author: Bai
 * @Date: 2022/12/14 00:35
 * @Version: 1.0
 */
public class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }



}
