package bronze5;

import java.io.*;
import java.math.BigInteger;

public class No_8437 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger sum = new BigInteger(br.readLine());
        BigInteger julkaPlus = new BigInteger(br.readLine());
        BigInteger x = sum.subtract(julkaPlus).divide(BigInteger.valueOf(2));

        System.out.println(x.add(julkaPlus));
//        x = x.subtract(julkaPlus);
        System.out.print(x);

    }
}
