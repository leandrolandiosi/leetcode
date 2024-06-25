class longestCommonPrefixS2 {
    public static String longestCommonPrefix(String[] strs) {
        String a = strs[0];
        for(int i=1;i<strs.length;i++) {
            while(strs[i].indexOf(a) != 0){
                a = a.substring(0,a.length()-1);
                if(a.isEmpty()){
                    return "";
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        String[] strs2 = {"flower","flow","flight"};
        String i = longestCommonPrefix(strs2);
        System.out.println(i);
    }
}