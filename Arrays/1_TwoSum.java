class Solution 
{
    public int[]/*This function returns an integer array */ twoSum/*Function name*/(int[] nums/*An integer array input*/, int target/*A single integer input*/) 
    {
       for(int i=0; i<nums.length; i++)
       {
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    return new int[]{i,j};         
                }
            }
       }
       return new int[]{}; /*this is written because in the start we mwntioned int[] which means it is necessary to return an array and incase if we do not find the ans then It returns an empty array.*/
    }
}
