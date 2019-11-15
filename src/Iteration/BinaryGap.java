package Iteration;

public class BinaryGap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var = 1 / 2;
		System.out.println(solution(1041));

	}

	public static int solution(int N) {
		int maxGap = 0;
		while (N > 0) {
			int var1 = N % 2;
			// computing the values
			N = N / 2;
			if (var1 == 1) {
				int var2 = N % 2;
				int interGap = 0;
				while (var2 == 0 && N > 1) {
					var2 = N % 2;
					// computing the values
					if (var2 == 0) {
						N = N / 2;
						interGap++;
					}
				}

				if (N > 0) {
					if (maxGap < interGap)
						maxGap = interGap;
				}

			}

		}
		return maxGap;
	}

}
