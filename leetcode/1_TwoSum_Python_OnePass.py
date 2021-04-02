class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        record = {}
        for i in range(len(nums)):
            leftOver = target - nums[i]
            if leftOver in record:
                return record[leftOver], i
            record[nums[i]] = i
