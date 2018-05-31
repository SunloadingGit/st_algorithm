# -*-coding:utf-8-*-

"""
原地去重列表中重复的元素，每个元素仅允许存在一次
"""


class Solution(object):
    def removeDuplicates(self, nums):
        dicts = {}
        index = 0
        while index < len(nums):
            if nums[index] in dicts:
                nums.pop(index)
            else:
                dicts[nums[index]] = 1
                index += 1
        return len(nums)


if __name__ == "__main__":
    lists = [[1, 2, 3, 4, 5], [1, 1, 2, 2, 3, 4, 5, 6], [1, 2, 2, 4, 5, 6, 6, 7, 8]]
    testobj = Solution()
    for nums in lists:
        testobj.removeDuplicates(nums)
        print(str(nums))
