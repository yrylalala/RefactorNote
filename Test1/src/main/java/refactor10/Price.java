package refactor10;

/**
 * @ClassName: Price
 * @Description: 价格抽象类
 * @Author: Bai
 * @Date: 2023/2/23 00:32
 * @Version: 1.0
 */
public abstract class Price {
    abstract int getPriceCode();

    // 实施搬移函数 将函数从 Movie 中搬到 Price
    public double getCharge(int dayRented) {
        double result = 0;
        switch (getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (dayRented > 2)
                    result += (dayRented - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                result += dayRented * 3;
                break;
            case Movie.CHILDRENS:
                result += 1.5;
                if (dayRented > 3)
                    result += (dayRented - 3) * 1.5;
                break;
        }
        return result;
    }
}
