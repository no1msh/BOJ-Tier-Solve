package bronze4;

import java.io.*;

public class No_15059 {

    public static int positiveCheck(int num1, int num2) {
        if (num2 > num1) {
            return num2 - num1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputStr = br.readLine().split(" ");
        String[] inputStr2 = br.readLine().split(" ");

        int a1 = Integer.parseInt(inputStr[0]);
        int b1 = Integer.parseInt(inputStr[1]);
        int c1 = Integer.parseInt(inputStr[2]);
        int a2 = Integer.parseInt(inputStr2[0]);
        int b2 = Integer.parseInt(inputStr2[1]);
        int c2 = Integer.parseInt(inputStr2[2]);
        int total = 0;
        total += positiveCheck(a1, a2) + positiveCheck(b1, b2) + positiveCheck(c1, c2);

        System.out.println(total);

    }
}