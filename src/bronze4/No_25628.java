package bronze4;

import java.io.*;

public class No_25628 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStr = br.readLine().split(" ");

        int bun = Integer.parseInt(inputStr[0]);
        int meat = Integer.parseInt(inputStr[1]);

        System.out.print(Math.min(bun / 2 , meat));

    }
}
