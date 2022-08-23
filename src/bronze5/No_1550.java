package bronze5;

import java.io.*;

public class No_1550 {

	static int convertHexToDec(char charHex) {
		switch (charHex) {
		case 'A':
			return 10;

		case 'B':
			return 11;

		case 'C':
			return 12;

		case 'D':
			return 13;

		case 'E':
			return 14;

		case 'F':
			return 15;
		}

		return charHex - '0';

	}

	static int pow16(int n) {

		int result = 1;
		for (int i = 0; i < n; i++) {
			result *= 16;
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String hex = br.readLine();
		int result = 0;
		
		for (int i = 1; i <= hex.length(); i++) {
			result += convertHexToDec(hex.charAt(hex.length() - i)) * pow16(i - 1);
		}

		System.out.println(result);
	}

}
