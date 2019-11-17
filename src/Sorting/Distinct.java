package Sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {

	public static int solution(int[] A) {
		return Arrays.stream(A).boxed().distinct().collect(Collectors.toList()).size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,2,1,2,3,3};
		int maxProduct = solution(A);
		System.out.println(maxProduct);
	}

}
