package bronze5;

import java.io.*;

public class No_24736 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] result = new int[2];
		for (int i = 0; i < 2; i++) {
			String[] inputStr = br.readLine().split(" ");

			int t = Integer.parseInt(inputStr[0]);
			int f = Integer.parseInt(inputStr[1]);
			int s = Integer.parseInt(inputStr[2]);
			int p = Integer.parseInt(inputStr[3]);
			int c = Integer.parseInt(inputStr[4]);

			int score = t * 6 + f * 3 + s * 2 + p * 1 + c * 2;

			result[i] = score;

		}

		for (int score : result) {
			System.out.print(score + " ");
		}

	}

}
