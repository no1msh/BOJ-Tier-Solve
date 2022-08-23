package bronze5;

import java.io.*;

public class No_18301 {
    public static void main(String[] args) throws IOException {
        //⌊(n1 + 1)(n2 + 1)/(n12 + 1) - 1⌋
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStr = br.readLine().split(" ");

        int n1 = Integer.parseInt(inputStr[0]);
        int n2 = Integer.parseInt(inputStr[1]);
        int n12 = Integer.parseInt(inputStr[2]);
        int n = (n1 + 1) * (n2 + 1) / (n12 + 1) - 1;

        System.out.print(n);

    }
}
