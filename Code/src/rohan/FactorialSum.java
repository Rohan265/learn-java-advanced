package rohan;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FactorialSum {

	public static void main(String[] args) {
		int[] arr = { 243, 546, 2210, 2120, 312, 8546, 212, 122 };
		int specialNumbers = factorialSum(arr);
		System.out.println("No. of Special Numbers in given array is : " + specialNumbers);
	}

	private static int factorialSum(int[] arr) {
		int specialNumbers = 0;// 122 = 1+2+2=5 => 5!=120 => 1&2(from 122) both the digits are present in 120
		for (int n : arr) {
			
			boolean isSpecial = true;
			Set<Character> digits = String.valueOf(n).chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
			int finalSum = calculateFinalSum(n);
			List<Character> factorial = String.valueOf(factorial(finalSum)).chars().mapToObj(c -> (char) c).collect(Collectors.toList());

			for (char digit : digits) {
				if (!factorial.contains(digit))
					isSpecial = false;
			}
			if (isSpecial)
				specialNumbers++;
		}
		return specialNumbers;
	}

	private static int factorial(int n) {
		if (n == 1 && n > 0)
			return 1;
		return n * factorial(n - 1);
	}

	private static int calculateFinalSum(int n) {
		int finalSum = n;

		while (finalSum > 10) {
			int sum = 0;
			while (finalSum != 0) {
				sum += finalSum % 10;
				finalSum = finalSum / 10;
			}
			finalSum = sum;
		}

		return finalSum;
	}
}
