package rohan;

import java.util.HashMap;
import java.util.Map;

class TwoSum {
	public static Map<Integer, Integer> twoSum(int[] nums, int target) {
		// Brute Force
		Map<Integer, Integer> map1 = new HashMap<>();
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (target - nums[j] == nums[i]) {
					map1.put(nums[i], nums[j]);
				}
			}
		}
		return map1;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 7, 3, 5, 1, 6 };
		int target = 8;
		Map<Integer, Integer> result = twoSum(nums, target);
		result.entrySet().stream().forEach(e -> System.out.printf("{" + e.getKey() + "," + e.getValue() + "}"));
		// System.out.println(result);
	}
}
