package bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_5928 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStr = br.readLine().split(" ");

        int start = 11 * 60 + 11;

        int d = Integer.parseInt(inputStr[0]);
        int h = Integer.parseInt(inputStr[1]);
        int m = Integer.parseInt(inputStr[2]);

        int end = ((d - 11) * 24 * 60) + h * 60 + m;
        int total = end - start;

        if (total >= 0) {
            System.out.print(total);
        } else {
            System.out.print(-1);
        }
    }
}
