class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int freq : map.values()) {
            if (freq > 1) {
                boolean prime = true;

                for (int i = 2; i * i <= freq; i++) {
                    if (freq % i == 0) {
                        prime = false;
                        break;
                    }
                }

                if (prime) {
                    return true;
                }
            }
        }

        return false;
    }
}