package ReplaceConditionalWithPolymorphism;

/**
 * @ClassName: ReplaceConditionalWithPolymorphism.ReplaceConditionalWithPolymorphism
 * @Description: 以多态取代表达式
 * @Author: Bai
 * @Date: 2023/2/23 00:59
 * @Version: 1.0
 */
public class ReplaceConditionalWithPolymorphism {
    private static final int EUROPEAN = 1;
    private static final int AFRICAN = 2;
    private static final int NORWEGIAN_BLUE = 3;
    private int _type;
    private int _numberOfCoconuts;
    private int _voltage;
    private boolean _isNailed;

    int getBaseSpeed() {
        return 10;
    }

    int getBaseSpeed(int arg) {
        return arg;
    }

    int getLoadFactor() {
        return 20;
    }

    // 重构前
    public double getSpeed() {
        switch (_type) {
            case EUROPEAN:
                return getBaseSpeed();
            case AFRICAN:
                return getBaseSpeed() - getLoadFactor() * _numberOfCoconuts;
            case NORWEGIAN_BLUE:
                return (_isNailed) ? 0 : getBaseSpeed(_voltage);
        }
        throw new RuntimeException("Should be unreachable");
    }
}


