package DP;
import java.util.* ;
import java.io.*;

//https://www.naukri.com/code360/problems/partitions-with-given-difference_3751628?source=youtube&campaign=striver_dp_videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_dp_videos&leftPanelTabValue=PROBLEM

public class Count_no_of_subset_with_difference
{

    public class Solution {
        public static int countPartitions(int n, int diff, int[] arr) {
            int sum = 0;
            for (int x : arr)
            {
                sum += x;
            }

            if ((diff + sum) % 2 != 0) {
                return 0;
            }

            int summ = (diff + sum) / 2;
            return cntsubsetsum(arr, summ);
        }

        public static int cntsubsetsum(int[] arr, int sum) {
            int[][] dp = new int[arr.length + 1][sum + 1];

            // Initialize dp array
            for (int i = 0; i <= arr.length; i++) {
                dp[i][0] = 1;
            }

            for (int i = 1; i <= arr.length; i++) {
                for (int j = 0; j <= sum; j++) {
                    if (arr[i - 1] <= j) {
                        dp[i][j] = dp[i - 1][j - arr[i - 1]] + dp[i - 1][j];
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }

            return dp[arr.length][sum];
        }

    }


}
