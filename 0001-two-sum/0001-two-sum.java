class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numIndices = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If the complement exists in the HashMap, return the indices.
            if (numIndices.containsKey(complement)) {
                return new int[]{numIndices.get(complement), i};
            }

            // Otherwise, put the current number and its index in the HashMap.
            numIndices.put(nums[i], i);
        }

        // If no solution is found, return an empty array or handle it as needed.
        return new int[]{};
    }
        
    }
