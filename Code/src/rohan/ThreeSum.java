package rohan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {
	public static List<List<Integer>> threeSum(int[] nums, int target) {
		// Brute Force
		List<List<Integer>> list = new ArrayList<>();
		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					if ( nums[i] +nums[j] + nums[k]  == target) {
						list.add(Arrays.asList(nums[i],nums[j],nums[k]));
					}
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7,8,9,10,11};
		int target = 12;
		List<List<Integer>> result = threeSum(nums, target);
		System.out.println(result);
		// System.out.println(result);
	}
}
