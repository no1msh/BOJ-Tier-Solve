package bronze5;

import java.io.*;

public class No_23037 {

    static int pow5(int number) {

        int result = 1;

        for (int i = 0; i < 5; i++) {
            result *= number;
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(br.readLine());
        int maxIndex = String.valueOf(inputNum).length();
        int result = 0;

        for (int i = 0; i < maxIndex; i++) {
            result += pow5(inputNum % 10);
            inputNum = inputNum / 10;
        }

        System.out.print(result);
    }
}
