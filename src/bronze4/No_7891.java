package bronze4;

import java.io.*;

public class No_7891 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());

        while(testCase-- > 0){
            String[] inputString = br.readLine().split(" ");
            int a = Integer.parseInt(inputString[0]);
            int b = Integer.parseInt(inputString[1]);

            sb.append(a+b).append("\n");
        }

        System.out.print(sb);
    }
}
