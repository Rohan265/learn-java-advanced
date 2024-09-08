package rohan;

import java.util.Arrays;

public class PrefixSum {

   public static void main(String[] args) {
	int[] prefixSum;
	int[] num= {1,2,3,4,5};
	prefixSum=computePrefixSum(num);
	System.out.println(Arrays.toString(prefixSum));
}

private static int[] computePrefixSum(int[] num) {
	int[] prefixSum=new int[num.length];
	prefixSum[0]=num[0];
	for(int i=1;i<num.length;i++) {
		prefixSum[i]=prefixSum[i-1]+num[i];
	}
	return prefixSum;
}
}
