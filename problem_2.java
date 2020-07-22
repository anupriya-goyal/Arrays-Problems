//Problem : Find Numbers with Even Number of Digits
// Example: Input: nums = [12,345,2,6,7896]
// Output: 2

//Approach 1: 
class Solution {
    public int findNumbers(int[] nums) {
        
        String strArray[] = new String[nums.length];
        int count=0;
        
        for(int i=0;i<nums.length;i++)
        {
            strArray[i]=String.valueOf(nums[i]);
        }
        
        for(int i=0;i<strArray.length;i++)
        {
            if(strArray[i].length()%2==0)
            {
                count++;
            }
        }
        
        return count;
        
    }
}

Time complexity:
O(n)
Space Complexity: O(n)

// Better Approach1:

class Solution {

    public int findNumbers(int[] nums) {
    int ans = 0;
    for(int i=0; i<nums.length; i++){
        String s1 = Integer.toString(nums[i]);
        if(s1.length() % 2 == 0)   ans++;
    }
    return ans;
   }
}

TC: O(n)
SC: O(1)

// Approach 2:

public int findNumbers(int[] nums) {
        int totalCount = 0; 
        for(int i=0;i<nums.length;i++){
            int d = nums[i];
            int count = 0; 
            while(d>0){
                d/=10;
                count++;
            }
			//checking if the count is even or not
            if(count%2 == 0)
                totalCount++;
        }
        return totalCount;
    }

TC: O(n)
SC: O(1)