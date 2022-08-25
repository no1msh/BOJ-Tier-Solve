package bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_4714 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            double weightInEarth = Double.parseDouble(br.readLine());

            if (weightInEarth < 0) {
                break;
            }
            System.out.printf("Objects weighing %.2f on Earth will weigh %.2f on the moon.\n", weightInEarth, weightInEarth * 0.167);
        }
    }
}
