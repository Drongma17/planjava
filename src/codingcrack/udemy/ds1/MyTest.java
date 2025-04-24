package codingcrack.udemy.ds1;

public class MyTest {

    public static int maxWater(int[] nums){
        int left =0, right = nums.length - 1;
        int maxWater =0;
        while (left < right){
           int store = Math.min(nums[left], nums[right]);
            maxWater = Math.max(maxWater, store * (right - left));
            if(nums[left] < nums[right]){
                left ++;
            }else {
               right --;
            }
        }
      return maxWater;
    }


    public static void main(String[] args) {

        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int maxArea = MyTest.maxWater(height1);
        System.out.println("max area is : " + maxArea);
    }

}
