package bronze4;

import java.io.*;
import java.math.BigInteger;

public class No_5893 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String inputBinary = br.readLine();
        BigInteger big = new BigInteger("0");

        for (int i = 0; i < inputBinary.length(); i++) {
            if (inputBinary.charAt(i) == '1') {
                big = big.add(new BigInteger("2").pow(inputBinary.length()-(i+1)));
            } else if (inputBinary.charAt(i) == '0'){
                big = big.add(new BigInteger("0"));
            } else if (inputBinary.equals("0")) {
                bw.write(String.valueOf("0"));
            }
        }

        BigInteger result = big.multiply(new BigInteger("17"));
        String last = "";

        while (result != BigInteger.valueOf(0)) {
            last += result.mod(BigInteger.valueOf(2));
            result = result.divide(BigInteger.valueOf(2));
        }
        for (int i = last.length()-1; i >= 0; i--) {
            bw.write(String.valueOf(last.charAt(i)));
        }

        bw.flush();
        br.close();
        bw.close();
    }
}