public class Solution {
    public static int romanToInt(String s) {

        int prev= 4000, num=0;
        for (int i=0; i<s.length();i++){
            int x = jarane(s.charAt(i));
            if (jarane(s.charAt(i))>prev) num-=2*prev;
            prev=jarane(s.charAt(i));
            num+=jarane(s.charAt(i));
        }
        return num;
    }
    static int jarane(char x){
        switch(x){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }

    public static void main(String[] args) {

        int i = romanToInt("IV ");
        System.out.println(i);
    }

}