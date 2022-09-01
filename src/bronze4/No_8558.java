package bronze4;

import java.io.*;

public class No_8558 {

    public static int fac(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fac(n - 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n < 5) {
            System.out.print(fac(n) % 10);
        } else {
            System.out.print(0);
        }
    }
}