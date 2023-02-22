package refactor11;

/**
 * @ClassName: RegularPrice
 * @Description: TODO
 * @Author: Bai
 * @Date: 2023/2/23 00:37
 * @Version: 1.0
 */
public class RegularPrice extends Price {
    public int getPriceCode(){
        return Movie.REGULAR;
    }

    // 将 Price 类中 getCharge() 方法相关 case 提取出来
    public double getCharge(int daysRented) {
        double result = 2;
        if (daysRented > 2)
            result += (daysRented - 2) * 1.5;
        return result;
    }
}
