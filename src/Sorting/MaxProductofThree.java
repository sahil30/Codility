package Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.lang.*;
public class MaxProductofThree {

	public static int solution(int[] A) {
		// write your code in Java SE 8

		List<Integer> data = Arrays.stream(A).boxed().collect(Collectors.toList()).stream()
				.sorted(Collections.reverseOrder()).collect(Collectors.toList());

		int max1 = data.get(0) * data.get(1) * data.get(2);
		int max2 = data.get(data.size() -1) * data.get(data.size() -2) * data.get(0);
		if(max1>max2)
			return max1;
		else 
			return max2;
					
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { -3, 1, 2, -2, 5, 6 };
		int maxProduct = solution(A);
		System.out.println(maxProduct);
	}

}
