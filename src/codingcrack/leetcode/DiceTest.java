package codingcrack.leetcode;

public class DiceTest {


   public static int diceDynamicProgramming(int n, int k, int target){

       int MOD = 1000000007;
       int[][] dp=new int[n+1][target+1];
       dp[0][0]= 1;

       for(int i=1; i<=n; i++){
           for(int j=1; j<= target; j++){
               for(int face=1; face<=k; face++){
                   if(j>=face){
                       dp[i][j]= (dp[i][j] + dp[i-1][j-face]) % MOD;
                   }
               }
           }
       }
       return dp[n][target];
   }


    public static void main(String[] args) {
     int n = 2;
     int k = 6;
     int target = 7;

        int returnValue = DiceTest.diceDynamicProgramming(n, k, target);
        System.out.println(returnValue);
    }
}
