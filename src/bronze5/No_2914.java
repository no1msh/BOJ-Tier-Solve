package bronze5;

import java.io.*;

public class No_2914 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] inputStr = br.readLine().split(" ");

		int songs = Integer.parseInt(inputStr[0]);
		int average = Integer.parseInt(inputStr[1]);

		System.out.println(songs * (average - 1) + 1);

	}

}
