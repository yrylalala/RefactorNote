/**
 * @className: SelfEncapsulateField
 * @description: 自分装字段
 * @author:  Bai
 * @date: 2023/2/23 00:17
 * @version: 1.0
 */
public class SelfEncapsulateField {
    private int _low, _high;

    // 重构前
    boolean includes(int arg) {
        return arg >= _low && arg <= _high;
    }

    // 重构后
    boolean includes_new(int arg) {
        return arg >= getLow() && arg < getHigh();
    }
    int getLow() {
        return _low;
    }
    int getHigh() {
        return _high;
    }


}
