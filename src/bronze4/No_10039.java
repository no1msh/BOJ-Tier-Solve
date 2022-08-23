package bronze4;

import java.io.*;

public class No_10039 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = 5;
        int sum = 0;
        while (testCase-- > 0) {
            int inputScore = Integer.parseInt(br.readLine());
            sum += Math.max(inputScore, 40);
        }
        System.out.print(sum / 5);
    }
}
