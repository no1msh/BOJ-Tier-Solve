package bronze4;

import java.io.*;

public class No_11121 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0) {
            String[] inputStr = br.readLine().split(" ");

            if (inputStr[0].equals(inputStr[1])) {
                System.out.println("OK");
            } else {
                System.out.println("ERROR");
            }
        }
    }
}
