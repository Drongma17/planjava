package database;

/*
You are given two positive integers n and k. A factor of an integer n is defined as an integer i where n % i == 0.

Consider a list of all factors of n sorted in ascending order, return the kth factor in this list or return -1 if n has less than k factors.
 */

public class KthFactory {


        public static int kthFactor(int n, int k) {
            int count=0;
            for(int i=1; i<=n;i++){
                if(n % i ==0){
                    count++;
                    if(count==k){
                        return i;
                    }
                }
            }
            return -1;
        }


    public static void main(String[] args) {
        int a = 12;
        int k = 4;
        System.out.println(kthFactor(a,k));
    }
}
