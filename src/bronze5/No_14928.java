package bronze5;

import java.io.*;

public class No_14928 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		long remainder = 0;
		
		for (int i = 0 ; i < input.length() ; i ++) {
			remainder = (remainder * 10 + (Character.getNumericValue(input.charAt(i)))) % 20000303;
		}
		
		System.out.print(remainder);
	}

}