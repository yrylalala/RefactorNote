package PullUpMethod;

import java.util.Date;

/**
 * @className: PreferredCustomer
 * @description: 11.2 Pull Up Method（函数上移）
 * 子类
 * @author: Bai
 * @date: 2023/5/3 00:41
 * @version: 1.0
 */
public class PreferredCustomer extends Customer {
    @Override
    double chargeFor(Date start, Date end) {
        System.out.println("Preferred Customer chargeFor...");
        return 0;
    }

    /**
     * @description: 重复代码，可以提取到父类 Customer 中
     * @date: 2023/5/3 00:44
     * @param:
     * @return:
     **/
    void createBill(Date date) {
        double chargeAmount = chargeFor(lastBillDate, date);
        addBill(date, chargeAmount);
    }
}
