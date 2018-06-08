# -*-coding:utf-8 -*-
class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        dicts = {}
        i = 0
        Nums = iter(nums)
        while True:
            try:
                num = next(Nums)
                if num in dicts.keys():
                    return [dicts[num], i]
                else:
                    dicts[target - num] = i
            except StopIteration:
                break
            i += 1
            print(i)
            print(str(dicts))
        return None


if __name__ == '__main__':
    nums = [2, 7, 11, 15]
    target = 9
    obj = Solution()
    rst = obj.twoSum(nums, target)
    print(rst)