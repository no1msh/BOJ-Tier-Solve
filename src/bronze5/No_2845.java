package bronze5;

import java.io.*;

public class No_2845 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] inputStr = br.readLine().split(" ");
		
		int people = Integer.parseInt(inputStr[0]);
		int space = Integer.parseInt(inputStr[1]);
		
		String[] inputStr2 = br.readLine().split(" ");
		
		for (int i = 0 ; i < inputStr2.length; i++) {
			System.out.print((Integer.parseInt(inputStr2[i]))-(people*space)+" ");
		}
	}

}
