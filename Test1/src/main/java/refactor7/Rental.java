package refactor7;

/**
 * @ClassName: originDemo.Rental
 * @Description: 租赁 表示某个顾客租了一部影片
 * @Author: Bai
 * @Date: 2022/12/14 00:29
 * @Version: 1.0
 */
public class Rental {

    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    // 将 switch 语句提取到 Movie 中
    public double getCharge() {
        return _movie.getCharge(_daysRented);
    }

    public int getFrequentRenterPoints() {
        // 为两天的新版本租赁添加奖金
        if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDaysRented() > 1)
            return 2;
        else
            return 1;
    }


}
