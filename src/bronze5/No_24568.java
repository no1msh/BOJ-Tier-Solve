package bronze5;

import java.io.*;

public class No_24568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int box8 = 8 * Integer.parseInt(br.readLine());
        int box3 = 3 * Integer.parseInt(br.readLine());

        System.out.print(box3 + box8 - 28);

    }
}
