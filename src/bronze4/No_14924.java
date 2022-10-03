package bronze4;

import java.io.*;

public class No_14924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStr = br.readLine().split(" ");
        int trainSpeed = Integer.parseInt(inputStr[0]);
        int flySpeed = Integer.parseInt(inputStr[1]);
        int distance = Integer.parseInt(inputStr[2]);

        System.out.print(distance / (trainSpeed * 2) * flySpeed);
    }
}
