public class Q15 {
    public int maxProfit(int[] prices) {
        int left = 0, right = 1, maxProfit = 0;

        while (right < prices.length) {
            if(prices[right] < prices[left]) {
                left = right;
                right = left + 1;
                continue;
            }

            maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
            right++;
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Q15 q15 = new Q15();

        System.out.println(q15.maxProfit(new int[]{7,1,5,3,0,6,1,8}));
    }
}
