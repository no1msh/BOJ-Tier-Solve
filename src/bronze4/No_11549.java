package bronze4;

import java.io.*;

public class No_11549 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String correct = br.readLine();

        String[] inputStr = br.readLine().split(" ");
        int count = 0;

        for (int i = 0; i < inputStr.length; i++) {
            if (correct.equals(inputStr[i])) {
                count++;
            }
        }

        System.out.print(count);
    }
}
