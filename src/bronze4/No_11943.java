package bronze4;

import java.io.*;

public class No_11943 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input1 = br.readLine().split(" ");
        String[] input2 = br.readLine().split(" ");

        int a = Integer.parseInt(input1[0]);
        int b = Integer.parseInt(input1[1]);
        int c = Integer.parseInt(input2[0]);
        int d = Integer.parseInt(input2[1]);

        int apple = b + c;
        int orange = a + d;

        System.out.print(Math.min(apple, orange));
    }
}