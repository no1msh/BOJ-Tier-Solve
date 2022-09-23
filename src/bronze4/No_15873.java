package bronze4;

import java.io.*;

public class No_15873 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine(); // 1010 x10 10x
        int a, b;

        if (inputStr.length() == 4) {
            a = 10;
            b = 10;
        } else if (inputStr.length() == 3) {
            if (inputStr.charAt(2) == '0') {
                a = inputStr.charAt(0) - '0';
                b = 10;
            } else {
                a = 10;
                b = inputStr.charAt(2) - '0';
            }

        } else {
            a = inputStr.charAt(0) - '0';
            b = inputStr.charAt(1) - '0';
        }

        System.out.println(a + b);
    }
}
