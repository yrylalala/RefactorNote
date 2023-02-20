package refactor3;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @ClassName: originDemo.Customer
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


    public String stetement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();

            // 确定每行的金额
            // 将函数调用直接修改为调用新函数
            thisAmount = each.getCharge();

            // 添加频繁的租赁点
            frequentRenterPoints++;
            // 为两天的新版本租赁添加奖金
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
                    each.getDaysRented() > 1) frequentRenterPoints++;

            //  显示此租金的数字
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }

        // 添加页脚行
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) +
                " frequent renter points";

        return result;
    }

    // 移动"金额计算"代码到 Rental 类中
    // private double amountFor(Rental aRental) {
    //     return aRental.getCharge();
    // }

}
