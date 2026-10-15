class Solution {
    public long minimumTotalCost(int[] nums1, int[] nums2) {
        int n = nums1.length;
        long cost = 0;
        int[] freq = new int[n + 1];
        int maxFreq = 0, dominant = -1, same = 0;

        for (int i = 0; i < n; i++) {
            if (nums1[i] == nums2[i]) {
                cost += i;
                same++;
                int f = ++freq[nums1[i]];

                if (f > maxFreq) {
                    maxFreq = f;
                    dominant = nums1[i];
                }
            }
        }

        int extra = 0;

        for (int i = 0; i < n && maxFreq > (same + extra) / 2; i++) {
            if (nums1[i] != nums2[i]
                    && nums1[i] != dominant
                    && nums2[i] != dominant) {
                cost += i;
                extra++;
            }
        }

        return maxFreq > (same + extra) / 2 ? -1 : cost;
    }
}