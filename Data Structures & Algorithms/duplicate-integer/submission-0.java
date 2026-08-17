class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        //using a hashset 

        HashSet <Integer> FindingDup = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++){
            int num = nums [i]; 

            if (FindingDup.contains (num)){
                return true;
            }

        FindingDup.add(num);
        }
        return false; 
    }
}