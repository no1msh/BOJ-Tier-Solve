package bronze5;

import java.io.*;

public class No_2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = br.readLine();

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) >= 97) {
                System.out.printf("%c", inputString.charAt(i) - 32);
            } else {
                System.out.printf("%c", inputString.charAt(i) + 32);
            }
        }

    }
}