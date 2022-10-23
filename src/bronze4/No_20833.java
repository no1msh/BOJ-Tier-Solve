package bronze4;

import java.io.*;

public class No_20833 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int sum = 0;
        while (testCase > 0){
            sum += testCase * testCase * testCase--;
        }

        System.out.print(sum);

    }
}
