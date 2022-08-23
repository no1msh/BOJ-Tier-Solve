package bronze5;

import java.io.*;
import java.math.BigInteger;

public class No_22193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputLength = br.readLine().split(" ");
        BigInteger a = new BigInteger(br.readLine());
        BigInteger b = new BigInteger(br.readLine());

        System.out.print(a.multiply(b));
    }
}
