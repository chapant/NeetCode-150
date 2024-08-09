public class Q30_EatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 0;

        for (int i = 0; i < piles.length; i++) {
            min = Math.max(min, piles[i]);
        }

        int l = 1;
        int r = min;

        while (l <= r) {
            int mid = (l + r) / 2;
            int count = 0;
            for (int i = 0; i < piles.length; i++) {
                count += piles[i] / mid;
                if(piles[i] % mid != 0) count += 1;
            }

            if (count <= h) {
                min = Math.min(min, mid);
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Q30_EatingBananas q = new Q30_EatingBananas();
        System.out.println(q.minEatingSpeed(new int[]{332484035,524908576,855865114,632922376,222257295,690155293,112677673,679580077,337406589,290818316,877337160,901728858,679284947,688210097,692137887,718203285,629455728,941802184}, 823855818));
    }
}
