public class Rotate_Matrix
{
    class Solution
    {
        public void rotate(int[][] arr)
        {
            int [][] ans = new int[arr.length][arr.length];

            for(int i = 0 ; i < arr.length ; i++)
            {
                for(int j = 0 ; j < arr.length ; j++)
                {
                    ans[j][(arr.length-1)-i] = arr[i][j];
                }
            }

            for(int i = 0 ;i < arr.length ; i++)
            {
                for(int j = 0 ; j < arr.length ; j++)
                {
                    arr[i][j] = ans[i][j];
                }
            }


        }
    }
}


// Approach 2:

class Solution {
    public void rotate(int[][] arr) {
        int n = arr.length;
        int[][] ans = new int[n][n];

        // Transpose the matrix and store in ans
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans[j][i] = arr[i][j];
            }
        }

        // Reverse rows of ans
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = ans[i][j];
                ans[i][j] = ans[i][n - 1 - j];
                ans[i][n - 1 - j] = temp;
            }
        }

        // Copy ans back to arr
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = ans[i][j];
            }
        }
    }
}

