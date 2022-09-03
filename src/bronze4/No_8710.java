package bronze4;

import java.io.*;

public class No_8710 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStr = br.readLine().split(" ");

        int man = Integer.parseInt(inputStr[0]);
        int needKey = Integer.parseInt(inputStr[1]);
        int hok = Integer.parseInt(inputStr[2]);

        int n = 1;
        while(true){
            if (n * hok >= needKey - man){
                System.out.print(n);
                break;
            } else {
                n++;
            }
        }

    }
}
