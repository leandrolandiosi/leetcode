
import java.math.RoundingMode;

public class PriceCalculator {


        public static boolean isPalindrome(int x) {

            String str = Integer.toString(x);
            String reversedStr = new StringBuilder(str).reverse().toString();

            if (str.equals(reversedStr)) {
                return true;}
                else {
                    return false;
            }

        }

    public static void main(String[] args) {
            isPalindrome(123) ;
    }
}
