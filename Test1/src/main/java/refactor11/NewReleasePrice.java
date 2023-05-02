package refactor11;

/**
 * @className: NewReleasePrice
 * @description: TODO
 * @author:  Bai
 * @date: 2023/2/23 00:35
 * @version: 1.0
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
