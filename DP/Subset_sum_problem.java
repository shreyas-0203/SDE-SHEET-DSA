package DP;

public class Subset_sum_problem
{
    public static void main(String[] args)
    {
        int N = 6;
        int [] arr = {5, 2, 3, 10, 6, 8};
        int sum = 1032321;

        if(isSubsetPresent(arr,sum))
        {
            System.out.println("Subset Present");
        }
        else {
            System.out.println("Subset Not Present");
        }
    }

    public static boolean isSubsetPresent(int [] arr, int sum)
    {
        boolean [][] dp = new boolean[arr.length+1][sum+1];
        for(int i = 0 ; i < arr.length+1 ; i++)
        {
            dp[i][0] = true;
        }

        for(int i = 1 ; i < arr.length+1 ; i++)
        {
            for(int j = 0 ; j < sum+1 ; j++)
            {
                if(arr[i-1] <= j)
                {
                    dp[i][j] = dp[i-1][j - arr[i-1]] || dp[i-1][j];
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
