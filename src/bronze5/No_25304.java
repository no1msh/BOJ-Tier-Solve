package bronze5;

import java.io.*;

public class No_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int spend = Integer.parseInt(br.readLine());
        int total = 0;
        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0) {
            String[] input = br.readLine().split(" ");
            total += Integer.parseInt(input[0]) * Integer.parseInt(input[1]);
        }

        if (spend == total) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
