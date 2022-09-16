package bronze4;

import java.io.*;

public class No_8760 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0) {
            String[] inputStr = br.readLine().split(" ");

            int x = Integer.parseInt(inputStr[0]);
            int y = Integer.parseInt(inputStr[1]);
            int area = x * y;
            System.out.println(area / 2);

        }


    }
}
