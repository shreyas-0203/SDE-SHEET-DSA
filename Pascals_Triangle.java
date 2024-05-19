import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle
{
    public List<List<Integer>> generate(int N) {

        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 1; i <=N ;i++)
        {
            ans.add(generateRows(i));
        }
        return ans;

    }

    public List<Integer> generateRows(int row)
    {
        List<Integer>ans = new ArrayList<>();
        ans.add(1);
        int temp = 1;

        for(int i = 1 ; i < row ; i++)
        {
            temp = temp *(row-i);
            temp = temp/(i);
            ans.add(temp);
        }
        return ans;
    }

}




/*
    First, we will consider r-1 as n and c-1 as r.
    After that, we will simply calculate the value of the combination using a loop.
    The loop will run from 0 to r. And in each iteration, we will multiply (n-i) with the result and divide the result by (i+1).
    Finally, the calculated value of the combination will be our answer.
 */