class lengthOfLastWordC {
    public static int lengthOfLastWord(String s) {
        int ret = 0;
        s = s.trim();
        for (int t = s.length() - 1; t >= 0; t--) {
            if (s.charAt(t) != ' ') {
                ret++;
            } else {
                return ret;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int i = lengthOfLastWord("   fly me   to   the moon  ");
        System.out.println(i);
    }
}