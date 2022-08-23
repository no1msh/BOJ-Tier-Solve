package bronze5;

import java.io.*;

public class No_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0) {
            String inputString = br.readLine();
            System.out.printf("%c%c\n",inputString.charAt(0),inputString.charAt(inputString.length()-1));
        }
    }
}
