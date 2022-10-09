package bronze4;

import java.io.*;

public class No_23795 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;
        while(true){
            int inputMoney = Integer.parseInt(br.readLine());

            if (inputMoney == -1) break;
            total += inputMoney;
        }

        System.out.print(total);
    }
}
