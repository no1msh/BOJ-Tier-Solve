package bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_13866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStr = br.readLine().split(" ");
        int a = Integer.parseInt(inputStr[0]);
        int b = Integer.parseInt(inputStr[1]);
        int c = Integer.parseInt(inputStr[2]);
        int d = Integer.parseInt(inputStr[3]);

        System.out.print(Math.abs((a + d) - (c + b)));

    }
}
