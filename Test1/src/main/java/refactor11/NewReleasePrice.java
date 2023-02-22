package refactor11;

/**
 * @ClassName: NewReleasePrice
 * @Description: TODO
 * @Author: Bai
 * @Date: 2023/2/23 00:35
 * @Version: 1.0
 */
public class NewReleasePrice extends Price {
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    // 将 Price 类中 getCharge() 方法相关 case 提取出来
    public double getCharge(int daysRented) {
        return daysRented * 3;
    }
}
