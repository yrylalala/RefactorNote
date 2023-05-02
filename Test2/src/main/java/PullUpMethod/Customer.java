package PullUpMethod;

import java.util.Date;

/**
 * @className: Customer
 * @description: 11.2 Pull Up Method（函数上移）
 * 父类 顾客
 * @author: Bai
 * @date: 2023/5/3 00:32
 * @version: 1.0
 */
public abstract class Customer {
    public Date lastBillDate;

    public void addBill(Date date, double amount) {
        System.out.println("Customer addBill: " + date + ", " + amount);
    }

    abstract double chargeFor(Date start, Date end);
}
