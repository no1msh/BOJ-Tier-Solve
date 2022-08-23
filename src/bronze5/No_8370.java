package bronze5;

import java.io.*;

public class No_8370 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] inputStr = br.readLine().split(" ");

		int n1 = Integer.parseInt(inputStr[0]);
		int n2 = Integer.parseInt(inputStr[1]);

		int x1 = Integer.parseInt(inputStr[2]);
		int x2 = Integer.parseInt(inputStr[3]);

		System.out.println(n1 * n2 + x1 * x2);

	}

}