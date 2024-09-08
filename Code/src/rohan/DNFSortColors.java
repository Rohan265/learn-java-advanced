package rohan;

import java.util.Arrays;

public class DNFSortColors {

	static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	static int[] dNFSort(int[] nums) {
		int low = 0;
		int mid = 0;
		int high = nums.length - 1;

		while (mid < high) {
			if (nums[mid] == 0) {
				swap(nums, low, mid);
				low++;
				mid++;
			} else if (nums[mid] == 1) {
				mid++;
			} else {
				swap(nums, mid, high);
				high--;
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		int[] dNFSort = dNFSort(new int[] { 1, 2, 2, 0, 1, 1, 2, 2, 0, 0, 2, 1 });
		System.out.println(Arrays.toString(dNFSort));
	}

}
