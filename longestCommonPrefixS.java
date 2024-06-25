class longestCommonPrefixS {
    public static String longestCommonPrefix(String[] strs) {
        char[] outputArray2 = new char[strs[0].length()];
        int qt = 0;
        int qt2 = 0;
        int vseq = 0;
        String ret = "";
        for (String element : strs) {
            if (element.length() < qt2 || qt2 == 0) {
                qt2 = element.length();
            }
            char[] outputArray = new char[element.length()];
            try {
                vseq = 0;
                for (int i = 0; i < element.length(); i++) {
                    outputArray[i] = element.charAt(i);
                    //System.out.println(element.charAt(i));
                    if (qt == 0) {
                        outputArray2[i] = element.charAt(i);
                    } else if (outputArray[i] == outputArray2[i] && vseq == 0) {
                        outputArray2[i] = element.charAt(i);
                    } else {
                        outputArray2[i] = '\0';
                        vseq = 1;
                    }
                }
            } catch (Exception e) {
            }
            qt++;
        }
        qt = 0;
        for (char element2 : outputArray2) {
            qt++;
            if (element2 != '\0' && qt <= qt2) {
                ret += element2;
            }
        }
        if (ret == null) {
            return "";
        } else {
            return ret;
        }
    }

    public static void main(String[] args) {
        String[] strs2 = {"cir", "car"};
        String i = longestCommonPrefix(strs2);
        System.out.println(i);
    }
}