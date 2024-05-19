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



