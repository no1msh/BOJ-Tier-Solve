package bronze4;

import java.io.*;

public class No_25494 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0) {
            String[] inputStr = br.readLine().split(" ");
            int a = Integer.parseInt(inputStr[0]);
            int b = Integer.parseInt(inputStr[1]);
            int c = Integer.parseInt(inputStr[2]);

            System.out.println(Math.min(Math.min(a, b), c));
        }
    }
}
