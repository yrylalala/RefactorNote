/**
 * @className: ReplaceTempWithQuery
 * @description: 以查询取代临时变量
 * @author:  Bai
 * @date: 2023/2/20 01:35
 * @version: 1.0
 */
public class ReplaceTempWithQuery {

    double _quantity;
    double _itemPrice;

    /**
     * 重构前
     **/
    public double beforeRefactor() {
        double basePrice = _quantity * _itemPrice;
        if (basePrice > 1000) {
            return basePrice * 0.95;
        } else {
            return basePrice * 0.98;
        }
    }

    /**
     * 重构后
     **/
    public double afterRefactor() {
        if (basePrice() > 1000) {
            return basePrice() * 0.95;
        } else {
            return basePrice() * 0.98;
        }
    }

    private double basePrice() {
        return _quantity * _itemPrice;
    }
}
