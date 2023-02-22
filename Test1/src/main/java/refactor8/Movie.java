package refactor8;

/**
 * @ClassName: originDemo.Movie
 * @Description: 影片
 * @Author: Bai
 * @Date: 2022/12/14 00:22
 * @Version: 1.0
 */
public class Movie {

    public static final int CHILDRENS = 2;

    public static final int REGULAR = 0;

    public static final int NEW_RELEASE = 1;


    private String _title;

    private int _priceCode;

    public Movie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int priceCode) {
        _priceCode = priceCode;
    }

    public String getTitle() {
        return _title;
    }

    public double getCharge(int dayRented) {
        double result = 0;
        switch (getPriceCode()) {
            case REGULAR:
                result += 2;
                if (dayRented > 2)
                    result += (dayRented - 2) * 1.5;
                break;
            case NEW_RELEASE:
                result += dayRented * 3;
                break;
            case CHILDRENS:
                result += 1.5;
                if (dayRented > 3)
                    result += (dayRented - 3) * 1.5;
                break;
        }
        return result;
    }

    // 将 Rental 中的常客积分计算代码搬到 Movie 中
    public int getFrequentRenterPoints(int dayRented) {
        // 为两天的新版本租赁添加奖金
        if ((getPriceCode() == NEW_RELEASE) && dayRented > 1)
            return 2;
        else
            return 1;
    }
}
