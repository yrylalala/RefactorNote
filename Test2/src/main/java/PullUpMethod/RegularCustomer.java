package PullUpMethod;

import java.util.Date;

/**
 * @className: RegularCustomer
 * @description: 11.2 Pull Up Method（函数上移）
 * 子类
 * @author: Bai
 * @date: 2023/5/3 00:36
 * @version: 1.0
 */
public class RegularCustomer extends Customer {
    @Override
    double chargeFor(Date start, Date end) {
        System.out.println("Regular Customer chargeFor...");
        return 0;
    }

    /**
     * @description: 重复代码，可以提取到父类 Customer 中
     * @date: 2023/5/3 00:49
     * @param: 
     * @return: 
     **/
    void createBill(Date date) {
        double chargeAmount = chargeFor(lastBillDate, date);
        addBill(date, chargeAmount);
    }
}
