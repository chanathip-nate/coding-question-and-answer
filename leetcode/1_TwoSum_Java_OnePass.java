class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> record = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int leftOver = target - nums[i];
            if(record.containsKey(leftOver)) {
                return new int[] {record.get(leftOver),i};
            }
            record.put(nums[i],i);
        }
        return new int[] {0,0};
    }
}