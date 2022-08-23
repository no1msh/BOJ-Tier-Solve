package bronze5;

import java.io.*;

public class No_11382 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] inputStr = br.readLine().split(" ");
		
		long a = Long.parseLong(inputStr[0]);
		long b = Long.parseLong(inputStr[1]);
		long c = Long.parseLong(inputStr[2]);
	
		System.out.println(a+b+c);
	}

}
