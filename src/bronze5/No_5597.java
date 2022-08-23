package bronze5;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class No_5597 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<Integer> student = new ArrayList<Integer>();

		for (Integer i = 1; i < 31; i++) {
			student.add(i);
		}
		
		for (Integer j = 0; j < 28; j++) {
			student.remove(Integer.valueOf(Integer.parseInt(br.readLine())));
		}
		
		student.sort(Comparator.naturalOrder());
		
		System.out.println(student.get(0));
		System.out.print(student.get(1));
	}

}
