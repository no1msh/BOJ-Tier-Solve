package bronze4;

import java.io.*;

public class No_14623 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String b1 = br.readLine();
        String b2 = br.readLine();
        Long l1 = Long.parseLong(b1, 2);
        Long l2 = Long.parseLong(b2, 2);

        System.out.print(Long.toBinaryString(l1 * l2));
    }
}