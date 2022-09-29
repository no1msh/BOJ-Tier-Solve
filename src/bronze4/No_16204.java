package bronze4;

import java.io.*;

public class No_16204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStr = br.readLine().split(" ");

        int total = Integer.parseInt(inputStr[0]);
        int frontO = Integer.parseInt(inputStr[1]);
        int frontX = total - frontO;
        int backO = Integer.parseInt(inputStr[2]);
        int backX = total - backO;

        System.out.println(Math.min(frontO , backO) + Math.min(frontX , backX));

    }
}
