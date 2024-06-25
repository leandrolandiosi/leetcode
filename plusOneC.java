import java.math.BigInteger;
public class plusOneC {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int v[] = {1,9,9};
        int i[] = plusOne(v);
        for (int ii = 0; ii < i.length; ii++) {
            System.out.println(Integer.toString(i[ii]));
        }
    }
}
