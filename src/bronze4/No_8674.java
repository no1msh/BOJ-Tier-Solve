package bronze4;

import java.io.*;

public class No_8674 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStr = br.readLine().split(" ");
        long x = Long.parseLong(inputStr[0]);
        long y = Long.parseLong(inputStr[1]);

        if (x % 2 == 0 || y % 2 == 0) {
            System.out.print(0);
        } else {
            if (x >= y) {
                System.out.print(y);
            } else {
                System.out.print(x);
            }
        }
    }
}
