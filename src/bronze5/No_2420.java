package bronze5;

import java.io.*;

public class No_2420 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputStr =  br.readLine().split(" ");
		
		Long a = Long.parseLong(inputStr[0]);
		Long b = Long.parseLong(inputStr[1]);
		
		System.out.print(Math.abs(a-b));
	}

}