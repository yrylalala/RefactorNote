package refactor12;

/**
 * @className: Price
 * @description: 价格抽象类
 * @author:  Bai
 * @date: 2023/2/23 00:32
 * @version: 1.0
 */
public abstract class Price {
    abstract int getPriceCode();

    // 实施搬移函数 将函数从 Movie 中搬到 Price
    // 将 case 分支移动到对应的字类中
    // 并将方法声明为 abstract
    abstract double getCharge(int dayRented);

    // 使用和 refactor11 相同的手法，由 Price 对应的子类实现 Movie 中的该方法
    // 这里父类中仅留下一个已定义的函数，作为一种默认行为
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
