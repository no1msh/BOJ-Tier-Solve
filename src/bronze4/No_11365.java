package bronze4;

import java.io.*;

public class No_11365 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String inputString = br.readLine();
            if (inputString.equals("END")) {
                break;
            }
            for (int i = inputString.length() - 1; i > -1; i--) {
                sb.append(inputString.charAt(i));
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}
