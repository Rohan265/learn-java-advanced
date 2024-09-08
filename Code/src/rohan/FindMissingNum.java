package rohan;

import java.util.Arrays;

public class FindMissingNum {
	
	public static int findMissingNum(int n, int[] nums) {
		int expectedSum=n*(n+1)/2;
		int sum = Arrays.stream(nums).sum();
		return expectedSum-sum;
		
	}

	public static void main(String[] args) {
		
		int[] nums= {1,2,3,4,6};
		int n=6;
		System.out.println(findMissingNum(n, nums));

	}

}
