/**
 * @ClassName: ExtractMethod
 * @Description: Extract Method P110
 * @Author: Bai
 * @Date: 2023/2/19 17:10
 * @Version: 1.0
 */
public class ExtractMethod {

    String _name;
    String amount;

    void printBanner() {
    }

    /**
     * 重构前
     **/
    void printOwing(double amount) {
        printBanner();

        // print details
        System.out.println("name:" + _name);
        System.out.println("amount:" + amount);
    }


    /**
     * 重构后
     **/
    void printOwing_new(double amount) {
        printBanner();
        printDetails(amount);
    }
    void printDetails(double amount) {
        System.out.println("name:" + _name);
        System.out.println("amount:" + amount);
    }

}
