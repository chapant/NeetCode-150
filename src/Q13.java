public class Q13 {
    public int maxArea(int[] heights) {
        int max = 0;

        int left = 0, right = heights.length - 1;

        while (left < right) {
            max = Math.max(max, Math.min(heights[left], heights[right]) * (right - left));

            if(heights[left] < heights[right]) {
                left++;
            }else{
                right--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Q13 q = new Q13();

        System.out.println(q.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
