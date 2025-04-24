package codingcrack.udemy.ds1;

public class ktimerightshiftSolution {


   public static int[] ktimerotate(int[] nums, int k){
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
       return nums;
    }

    public static int[] reverse(int[] nums, int i, int j){
        while(i < j){
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] numbs ={1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int k =3;
        int[] numbs1 = ktimerightshiftSolution.ktimerotate(numbs, k);
        for(int i: numbs1){
            System.out.print(i +" ");
        }
    }

}
