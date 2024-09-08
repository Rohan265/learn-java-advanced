package rohan;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateInArray {

	static Set<Integer> findDuplicate(int[] nums) {
		Set<Integer>  duplicates = new HashSet<>();
		Set<Integer> unique = new HashSet<>();
		for(int n:nums) {
			if(!unique.add(n)) {
				duplicates.add(n);
			}
		}
		return duplicates;
	}
	public static void main(String[] args) {

		System.out.println(findDuplicate(new int[] {1,2,2,3,4,4,5,6,6,7,8,8,8}));
	}

}
