class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        
        for(int head=0,tail=numbers.length-1;head<tail;head++)
        {
            for(;tail>head;tail--)
            {
                int a=numbers[head], b=numbers[tail];
                if(a+b<=target){break;}
            }
            
            int a=numbers[head], b=numbers[tail];
            if(a+b==target)
            {                
                ans[0]=head+1;
                ans[1]=tail+1;
                break;//set break there, in case the situation of the same number adding twice
            } 
        }
        return ans;
    }
}
