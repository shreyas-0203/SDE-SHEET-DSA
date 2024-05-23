public class Maximum_Subarray_KADANE
{
    class Solution
    {
        public int maxSubArray(int[] arr)
        {
            int sum = 0;
            int maxi = Integer.MIN_VALUE;


            int start = 0;
            int ansStart = -1;
            int ansEnd = -1;

            for(int i = 0 ; i < arr.length ; i++)
            {
                if(sum == 0)
                {
                    start = i;
                }

                sum = sum + arr[i];

                if(sum > maxi)
                {
                    maxi = sum;
                    ansStart = start;
                    ansEnd = i;
                }

                if(sum < 0)
                {
                    sum = 0;
                }

            }


            for(int i = ansStart; i <= ansEnd ; i++)
            {
                System.out.print(arr[i]+" ");
            }
            return maxi;

        }
    }
}
