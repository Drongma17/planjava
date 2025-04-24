package codingcrack.udemy.ds1;

public class MaxAreaOfWaterFilled {


    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int ans = 0;
        while (left < right) {
            int store = Math.min(height[left], height[right]);
            ans = Math.max(ans, store * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int maxArea = MaxAreaOfWaterFilled.maxArea(height1);
        System.out.println("max area is : " + maxArea);
    }


}

