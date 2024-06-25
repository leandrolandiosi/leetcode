import java.util.Objects;

public class RomanToInteger {
    public enum RomanNumeral {
        I(1),
        V(5),
        X(10),
        L(50),
        C(100),
        D(500),
        M(1000);

        private final int value;

        RomanNumeral(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
    public static int romanToInt(String s) {
        String str = s;
        int ret = 0;
        int valor = 0;
        int qtd = 0;
        char vlrAnt = 0;
        char vlrAtu = 0;
        if (str.length() == 1) {
            RomanNumeral numeral = RomanNumeral.valueOf(String.valueOf(str));
            return numeral.getValue();
        } else {
            for (int i = 0; i < str.length(); i++) {
                vlrAtu = str.charAt(i);
                //char vlrNxt = str.charAt(i + 1);
                if (Objects.equals(vlrAtu, vlrAnt)) {
                    qtd++;
                } else {
                if (vlrAtu == 'V' && vlrAnt == 'I') {
                    ret = ret + 3;
                } else if (vlrAtu == 'X' && vlrAnt == 'I') {
                    ret = ret + 8;
                }
                else if (vlrAtu == 'L' && vlrAnt == 'X') {
                    ret = ret + 30;
                }
                else if (vlrAtu == 'C' && vlrAnt == 'X') {
                    ret = ret + 80;
                }
                else if (vlrAtu == 'D' && vlrAnt == 'C') {
                    ret = ret + 300;
                }
                else if (vlrAtu == 'M' && vlrAnt == 'C') {
                    ret = ret + 800;
                } else if (qtd > 0 ){
                    RomanNumeral numeral = RomanNumeral.valueOf(String.valueOf(vlrAnt));
                    valor =  numeral.getValue() * qtd ;
                    qtd = 0;
                    ret = ret + valor;
                  //  if (i == str.length()-1){
                        numeral = RomanNumeral.valueOf(String.valueOf(vlrAtu));
                        valor = numeral.getValue();
                        ret = ret + valor;
                   // }
                }
                else {
                   RomanNumeral numeral = RomanNumeral.valueOf(String.valueOf(vlrAtu));
                    valor = numeral.getValue();
                    ret = ret + valor;
                }
                    vlrAnt = vlrAtu;
            }}
            if (qtd > 0) {
                RomanNumeral numeral = RomanNumeral.valueOf(String.valueOf(vlrAtu));
                valor =  numeral.getValue() * qtd ;
                qtd = 0;
                ret = ret + valor;
            }
        }
        return ret;
    }

    public static void main(String[] args) {

        int i = romanToInt("MDCCCLXXXIV");
        System.out.println(i);
    }
}
