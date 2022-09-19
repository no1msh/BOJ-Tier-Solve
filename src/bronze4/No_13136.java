package bronze4;

import java.io.*;

public class No_13136 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStr = br.readLine().split(" ");

        int x = Integer.parseInt(inputStr[0]);
        int y = Integer.parseInt(inputStr[1]);
        int cctv = Integer.parseInt(inputStr[2]);

        long cctvX = (long) Math.ceil((double) x / cctv);
        long cctvY = (long) Math.ceil((double) y / cctv);
        long result = cctvX * cctvY;

        System.out.println(result);
    }
}
