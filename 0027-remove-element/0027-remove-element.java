class Solution {
    public int removeElement(int[] nums, int val) {
         int k = 0; // Pointer for the position where non-val elements should be placed
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Place non-val element at position k
                k++; // Increment k
            }
        }
        
        return k; // k represents the number of elements not equal to val
    }
        
    
}