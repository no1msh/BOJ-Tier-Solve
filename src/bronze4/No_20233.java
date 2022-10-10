package bronze4;

import java.io.*;

public class No_20233 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int x = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int timeOfDay = Integer.parseInt(br.readLine());
        int option1 = ((Math.max(timeOfDay - 30, 0)) * x) * 21 + a;
        int option2 = ((Math.max(timeOfDay - 45, 0)) * y) * 21 + b;
        System.out.printf("%d %d", option1, option2);

    }
}
