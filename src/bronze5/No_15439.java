package bronze5;

import java.io.*;

public class No_15439 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		System.out.print(n * (n - 1));
	}
}