package bronze5;

import java.io.*;

public class No_5554 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int time1 = Integer.parseInt(br.readLine());
		int time2 = Integer.parseInt(br.readLine());
		int time3 = Integer.parseInt(br.readLine());
		int time4 = Integer.parseInt(br.readLine());

		int sumMinute = (time1 + time2 + time3 + time4) / 60;
		int sumSecond = (time1 + time2 + time3 + time4) % 60;
		
		System.out.print(sumMinute + "\n" + sumSecond);
	}

}
