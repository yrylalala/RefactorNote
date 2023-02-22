package refactor11;

/**
 * @ClassName: ChildrensPrice
 * @Description: TODO
 * @Author: Bai
 * @Date: 2023/2/23 00:33
 * @Version: 1.0
 */
public class ChildrensPrice extends Price {
    public int getPriceCode(){
        return Movie.CHILDRENS;
    }

    // 将 Price 类中 getCharge() 方法相关 case 提取出来
    public double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3)
            result += (daysRented - 3) * 1.5;
        return result;
    }
}
