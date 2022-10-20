package bronze4;

import java.io.*;

public class No_18398 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int testCase = Integer.parseInt(br.readLine());
            while (testCase-- > 0) {
                String[] inputStr = br.readLine().split(" ");
                int a = Integer.parseInt(inputStr[0]);
                int b = Integer.parseInt(inputStr[1]);

                System.out.printf("%d %d\n", a + b, a * b);
            }
        }

    }
}
