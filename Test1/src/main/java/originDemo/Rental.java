package originDemo;

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

}
