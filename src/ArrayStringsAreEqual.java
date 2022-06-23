public class ArrayStringsAreEqual {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int i, j, l1, l2;
        l1 = l2 = i = j = 0;
        while (i < word1.length && j < word2.length) {
            String curA = word1[i];
            String curB = word2[j];
            while (l1 < curA.length() && l2 < curB.length()) {
                if (curA.charAt(l1++) != curB.charAt(l2++))
                    return false;
            }
            if (l1 == curA.length()) {
                i++;
                l1 = 0;
                if (i == word1.length && (l2 != curB.length() || j + 1 < word2.length))
                    return false;
            }
            else {
                j++;
                l2 = 0;
                if (j == word2.length)
                    return false;
            }
        }
        return true;
    }
}
