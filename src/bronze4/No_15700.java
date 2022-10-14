package bronze4;

import java.io.*;

public class No_15700 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStr = br.readLine().split(" ");
        long x = Long.parseLong(inputStr[0]);
        long y = Long.parseLong(inputStr[1]);

        System.out.print(x * y / 2);
    }
}
