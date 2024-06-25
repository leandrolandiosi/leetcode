public class findString {
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
    public static void main(String[] args) {
        int i = strStr("haystack","needle");
        System.out.println(i+1);
    }
}
