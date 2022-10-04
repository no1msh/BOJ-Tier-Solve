package bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_25377 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        int result = Integer.MAX_VALUE;
        while (testCase-- > 0) {
            String[] inputStr = br.readLine().split(" ");
            int needGoTime = Integer.parseInt(inputStr[0]);
            int needBreadTime = Integer.parseInt(inputStr[1]);

            if (needGoTime <= needBreadTime) {
                if (result > needBreadTime) {
                    result = needBreadTime;
                }
            }
        }
        if (result == Integer.MAX_VALUE) result = -1;

        System.out.print(result);
    }
}
