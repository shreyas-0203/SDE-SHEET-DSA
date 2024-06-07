package DP;
//https://leetcode.com/problems/partition-equal-subset-sum/

public class Partition_Equal_Subset_Sum
{
    class Solution {
        public boolean canPartition(int[] arr) {
            int sum = 0;
            for (int x : arr) {
                sum += x;
            }

            // If the sum is odd, it cannot be partitioned into two equal subsets
            if (sum % 2 != 0) {
                return false;
            }

            // Otherwise, check if there's a subset with sum equal to half of total sum
            return subsetsum(arr, sum / 2);
        }


        public boolean subsetsum(int[] arr, int sum)
        {
            boolean[][] dp = new boolean[arr.length + 1][sum + 1];

            // Initialize the dp array
            for (int i = 0; i <= arr.length; i++) {
                dp[i][0] = true; // A sum of 0 can be achieved by not picking any element
            }

            for (int i = 1; i <= arr.length; i++)
            {
                for (int j = 1; j <= sum; j++)
                {
                    if (arr[i - 1] <= j)
                    {
                        dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
                    }
                    else
                    {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }

            return dp[arr.length][sum];
        }
    }

}
