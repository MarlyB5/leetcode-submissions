
class Solution {
    public int[] twoSum(int[] nums, int target) {

        //create new empty hashmap that contains the number and its index 

        HashMap <Integer, Integer> seen = new HashMap <Integer, Integer>(); 

        for (int i = 0; i < nums.length; i++ ) {

            int complement = target - nums[i]; 
            
            // if we have seen the compliment of i already  
            if (seen.containsKey(complement)) {
                // return answer 
                return new int[]{seen.get(complement), i};
            }

            seen.put(nums[i], i);
        }
        
        return null;
    }
}