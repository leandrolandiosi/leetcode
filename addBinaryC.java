import java.math.BigInteger;
public class addBinaryC {
    public static String addBinary(String a, String b) {
        BigInteger q1 = new BigInteger(a);
        BigInteger q2 = new BigInteger(b);
        BigInteger q3 = q1.add(q2);
        String v = q3.toString();
        String ret = "";
        int q = 0;
        for (int i = v.length()-1; i >= 0; i--){
            int n = Integer.parseInt(String.valueOf(v.charAt(i)))+q;
            if (n == 0){
                ret = "0"+ret;
                q = 0;
            }
            if (n == 1) {
                ret = "1"+ret;
                q = 0;
            }
            if (n == 2){
                ret = "0"+ret;
                q = 1;
            }
            if (n == 3){
                ret = "1"+ret;
                q = 1;
            }
        }
        if (q == 1) {
            ret = "1"+ret;
        }
        return ret;
    }

    public static void main(String[] args) {
        String i = addBinary("1110110101","1110111011");
        System.out.println(i);
    }

}
