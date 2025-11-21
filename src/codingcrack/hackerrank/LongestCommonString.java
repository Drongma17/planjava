package codingcrack.hackerrank;

public class LongestCommonString {

    static int commonChild(String s1, String s2){
        return LCSM4(s1.toCharArray(), s2.toCharArray(), s1.length(), s2.length());
    }

    public static int LCSM4(char[] x, char[] y, int m, int n){
        int memo[] = new int[n+1];

        for(int i=1; i<=m; i++){
            int prev =0;
            for(int j=1; j<=n; j++){
                int temp = memo[j];
                if(x[i-1] == y[j -1]){
                    memo[j] = prev +1;
                }else {
                    memo[j] = Math.max(memo[j],memo[j-1]);
                }
                prev = temp;
            }
        }
        return memo[n];
    }


    public static void main(String[] args) {
     String str1 = "HelloWorld";
     String str2 = "Welcome";

    int comm=  commonChild(str1, str2);
        System.out.println(comm);
    }
}
