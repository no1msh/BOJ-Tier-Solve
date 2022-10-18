package bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_23825 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStr = br.readLine().split(" ");

        int a = Integer.parseInt(inputStr[0]);
        int b = Integer.parseInt(inputStr[1]);

        System.out.println(Math.min(a, b) / 2);

    }
}
