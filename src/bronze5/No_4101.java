package bronze5;

import java.io.*;

public class No_4101 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String[] inputStr = br.readLine().split(" ");

			int a = Integer.parseInt(inputStr[0]);
			int b = Integer.parseInt(inputStr[1]);

			if (a == 0 && b == 0) {
				break;
			}
			
			if (a > b) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

}