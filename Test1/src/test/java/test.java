import originDemo.Customer;
import originDemo.Movie;
import originDemo.Rental;

/**
 * @ClassName: test
 * @Description: 第一章测试类
 * @Author: Bai
 * @Date: 2023/2/19 16:41
 * @Version: 1.0
 */
public class test {

    public static void main(String[] args) {
        Customer test = new Customer("test");
        Movie movie1 = new Movie("movie1", Movie.REGULAR);
        Movie movie2 = new Movie("movie2", Movie.NEW_RELEASE);

        Rental rental1 = new Rental(movie1, 1);
        Rental rental2 = new Rental(movie2, 2);

        test.addRental(rental1);
        test.addRental(rental2);

        String result = test.stetement();
        System.out.println(result);
    }

}
