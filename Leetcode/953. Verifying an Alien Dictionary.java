
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] pos = new int[26];

        for (int i = 0; i < order.length(); i++) {
            pos[order.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < words.length - 1; i++) {
            String s1 = words[i];
            String s2 = words[i + 1];

            int len = Math.min(s1.length(), s2.length());

            for (int j = 0; j < len; j++) {
                if (s1.charAt(j) != s2.charAt(j)) {
                    if (pos[s1.charAt(j) - 'a'] >
                        pos[s2.charAt(j) - 'a']) {
                        return false;
                    }
                    break;
                }

                if (j == len - 1 && s1.length() > s2.length()) {
                    return false;
                }
            }
        }

        return true;
    }
}
