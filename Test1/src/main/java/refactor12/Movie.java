package refactor12;

/**
 * @className: originDemo.Movie
 * @description: 影片
 * @author:  Bai
 * @date: 2022/12/14 00:22
 * @version: 1.0
 */
public class Movie {

    public static final int CHILDRENS = 2;

    public static final int REGULAR = 0;

    public static final int NEW_RELEASE = 1;

    private String _title;

    /**
     * 在Movie 内部保存一个 Price 对象
     * 而不再是保存一个 _priceCode 变量
     **/
    // private int _priceCode;
    private Price _price;

    public Movie(String title, int priceCode) {
        _title = title;
        // 针对类型代码使用， 参考 SelfEncapsulateField
        setPriceCode(priceCode);
    }
    // 修改访问函数
    public int getPriceCode() {
        return _price.getPriceCode();
    }

    // 修改赋值函数
    public void setPriceCode(int arg) {
        switch (arg) {
            case REGULAR:
                _price = new RegularPrice();
                break;
            case CHILDRENS:
                _price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    public String getTitle() {
        return _title;
    }

    /**
     * 实施 Move Method 搬移函数
     **/
    public double getCharge(int dayRented) {
        return _price.getCharge(dayRented);
    }

    // 使用和 refactor11 相同的手法，现将该方法移动到 Price 类中
    // 然后由 Price 对应的子类实现该方法内的分支
    public int getFrequentRenterPoints(int dayRented) {
        return _price.getFrequentRenterPoints(dayRented);
    }
}
