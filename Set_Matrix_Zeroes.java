import java.util.Arrays;

public class Set_Matrix_Zeroes
{
    public void setZeroes(int[][] arr)
    {
        int [] row = new int[arr.length];
        Arrays.fill(row,0);
        int [] col = new int[arr[0].length];
        Arrays.fill(col,0);

        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr[0].length ; j++)
            {
                if(arr[i][j] == 0)
                {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr[0].length ; j++)
            {
                if(row[i]==1 || col[j] == 1)
                {
                    arr[i][j] = 0;
                }
            }
        }

    }
}


/*

Brute Force :
            1) Traverse when u find zero Mark row and mark col to -1 EXCEPT 0.
            2) After that traverse again and re-mark -1 to Zero.

            3) Time Complexity = O(n^3)

Optimal Solution:
            1) Make one row-sized-array and col-sized-array to keep track location o zeros in matrix.
            2) When arr[i][j]==0 ,row array or col-array index sets to 1
            3) At last just re traverse the array and check if row/col array is sets or not
                if sets then arr[i][j] = 0 else remain 1.

            4) Time Complexity = O(2*n*m).
            5) Space Complexity = O(m) + O(n).

 */