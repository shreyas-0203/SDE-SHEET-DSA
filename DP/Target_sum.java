package DP;

public class Target_sum
{
    class Solution
    {
        public int findTargetSumWays(int[] arr, int target)
        {
            int sum = 0;
            for(int x : arr)
            {
                sum+=x;
            }

            if((sum+target) % 2 != 0 || sum < Math.abs(target))
            {
                return 0;
            }

            int summ = (target + sum) /2;

            return cntsubsetsum(arr,summ);
        }

        public int cntsubsetsum(int[] arr, int sum)
        {
            int [][]dp = new int[arr.length+1][sum+1];

            for(int i = 0 ; i < arr.length+1 ; i++)
            {
                dp[i][0] = 1;
            }

            for(int i = 1 ; i < arr.length+1 ; i++)
            {
                for(int j = 0 ; j  < sum+1 ; j++)
                {
                    if(arr[i-1] <= j)
                    {
                        dp[i][j] = dp[i-1][j - arr[i-1]] + dp[i-1][j];
                    }
                    else
                    {
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
            return dp[arr.length][sum];
        }
    }
}
