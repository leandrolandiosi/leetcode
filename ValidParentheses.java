public class ValidParentheses {
    public static boolean isValid(String s) {
        int ii =0;
       if (s.length() % 2 != 0) return false;
        for(int i=0;i<=s.length();i++) {
            try {
                if (s.charAt(i) == ')') {
                        ii = i-1;
                        while (ii >= 0) {
                            if (s.charAt(ii) == '('){
                                s = s.substring(0, ii) + s.substring(ii + 1);
                                s = s.substring(0, i - 1) + s.substring(i);
                                i = 0;
                                ii=0;
                            }
                            if (s.charAt(ii) != '[' || s.charAt(ii) != '{') {
                               ii=0;
                            }
                            ii--;
                        }}
                if (s.charAt(i) == '}') {
                        ii = i-1;
                        while (ii >= 0) {

                            if (s.charAt(ii) == '{') {
                                s = s.substring(0, ii) + s.substring(ii + 1);
                                s = s.substring(0, i - 1) + s.substring(i);
                                i=0;
                                ii=0;
                            }
                            if (s.charAt(ii) != '[' || s.charAt(ii) != '(') {
                                ii=0;
                            }
                            ii--;
                        }}
                if (s.charAt(i) == ']') {
                        ii = i-1;
                        while (ii >= 0) {
                        //for (int ii = 0; ii < i; ii++) {
                            if (s.charAt(ii) == '[') {
                                s = s.substring(0, ii) + s.substring(ii + 1);
                                s = s.substring(0, i - 1) + s.substring(i);
                                i=0;
                                ii=0;
                            }
                            if (s.charAt(ii) != '(' || s.charAt(ii) != '{') {
                                ii=0;
                            }
                            ii--;
                        }}

            } catch (Exception e) {
            }
        }
        return (s.length() == 0) ? true : false;
    }
    public static void main(String[] args) {
        Boolean i = isValid("[([]])");
        if (i){System.out.println("true");}else{System.out.println("false");}
    }

}
