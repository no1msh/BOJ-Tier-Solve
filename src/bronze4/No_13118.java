package bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_13118 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStr = br.readLine().split(" ");
        String[] inputCircle = br.readLine().split(" ");

        int circleX = Integer.parseInt(inputCircle[0]);

        for (int i = 0; i < 4; i++) {
            if (Integer.parseInt(inputStr[i]) == circleX) {
                System.out.print(i + 1);
                return;
            }
        }

        System.out.print(0);

    }
}
