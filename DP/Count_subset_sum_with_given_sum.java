package DP;
//https://www.geeksforgeeks.org/problems/perfect-sum-problem5633/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=perfect-sum-problem

public class Count_subset_sum_with_given_sum
{

    class Solution {

        public int perfectSum(int arr[], int n, int sum) {
            int MOD = 1000000007; // Use MOD to handle large numbers and prevent overflow
            int[][] dp = new int[n + 1][sum + 1];

            // Initialize the dp array
            for (int i = 0; i <= n; i++) {
                dp[i][0] = 1; // There's always one way to get a sum of 0: by not including any elements
            }

            // Fill the dp array
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j <= sum; j++) {
                    if (arr[i - 1] <= j) {
                        dp[i][j] = (dp[i - 1][j - arr[i - 1]] + dp[i - 1][j]) % MOD;
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }

            return dp[n][sum];
        }
    }


}
