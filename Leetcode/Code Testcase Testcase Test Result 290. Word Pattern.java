class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        if(pattern.length() != words.length) {
            return false;
        }
        HashMap<String, Character> wordMap = new HashMap<>();
        StringBuilder wordBuilder = new StringBuilder();
        char ch1 = 'A';

        for(String word : words) {
            if(wordMap.containsKey(word)) {
                wordBuilder.append(wordMap.get(word));
            }
            else {
                wordMap.put(word, ch1);
                wordBuilder.append(ch1);
                ch1++;
            }
        }
        HashMap<Character, Character> patternMap = new HashMap<>();
        StringBuilder patternBuilder = new StringBuilder();
        char ch2 = 'A';

        for(int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);

            if(patternMap.containsKey(c)) {
                patternBuilder.append(patternMap.get(c));
            }
            else {
                patternMap.put(c, ch2);
                patternBuilder.append(ch2);
                ch2++;
            }
        }

        return wordBuilder.toString().equals(patternBuilder.toString());
    }
}
