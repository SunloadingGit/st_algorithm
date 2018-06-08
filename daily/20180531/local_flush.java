import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class local_flush {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2,2,4,5,6,4};
		Solution s = new Solution();
		for (int i=0;i < s.removeDuplicates(nums);i++){
			System.out.print(nums[i]);
		}
	}

}

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)return 0;
        int i=0,j=nums.length-1,temp;
        HashMap map = new HashMap();
        map.put(nums[0], 1);
        while (i<j){
        	if(nums[i+1]==nums[i] || map.containsKey(nums[i+1])) {
        		temp=nums[i+1];
        		nums[i+1] = nums[j];
        		nums[j] = temp;
        		j--;
        	}
        	else {
        		map.put(nums[i+1],1);
        		i++;
 
        	}
        }
        Arrays.sort(nums, 0,i);
    	return i+1;
    }
}