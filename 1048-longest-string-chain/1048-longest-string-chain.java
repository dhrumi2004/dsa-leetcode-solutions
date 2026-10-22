class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (a, b) -> a.length() - b.length());

        HashMap<String, Integer> dp = new HashMap<>();
        int maxChain = 1;

        for (String word : words) {
            int longest = 1;

            for (int i = 0; i < word.length(); i++) {
                String prev = word.substring(0, i) + word.substring(i + 1);
                longest = Math.max(longest, dp.getOrDefault(prev, 0) + 1);
            }

            dp.put(word, longest);
            maxChain = Math.max(maxChain, longest);
        }

        return maxChain;
    }
}