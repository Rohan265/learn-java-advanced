package string;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {

		String s="leetcode";
		
		Map<Object, Long> collect = s.chars().mapToObj(ch-> (char) ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		collect.entrySet().stream().findFirst();
		System.out.println(collect);
	}

}
