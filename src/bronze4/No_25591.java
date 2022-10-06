package bronze4;

import java.io.*;

public class No_25591 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStr = br.readLine().split(" ");
        int num1 = Integer.parseInt(inputStr[0]);
        int num2 = Integer.parseInt(inputStr[1]);

        int a = 100 - num1;
        int b = 100 - num2;
        int c = 100 - (a + b);
        int d = a * b;
        int q = d / 100;
        int r = d % 100;

        System.out.printf("%d %d %d %d %d %d\n" , a , b, c, d, q, r);
        System.out.printf("%d %d",c+q , r);
    }
}
