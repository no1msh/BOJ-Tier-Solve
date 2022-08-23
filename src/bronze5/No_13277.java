package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class No_13277 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputStr = br.readLine().split(" ");
        BigInteger b1 = new BigInteger(inputStr[0]);
        BigInteger b2 = new BigInteger(inputStr[1]);

        System.out.print(b1.multiply(b2));
    }
}
