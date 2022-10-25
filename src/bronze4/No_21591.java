package bronze4;

import java.io.*;

public class No_21591 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStr = br.readLine().split(" ");
        int laptopW = Integer.parseInt(inputStr[0]);
        int laptopH = Integer.parseInt(inputStr[1]);
        int stickerW = Integer.parseInt(inputStr[2]);
        int stickerH = Integer.parseInt(inputStr[3]);

        if (laptopH - stickerH >= 2 && laptopW - stickerW >= 2) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }

    }
}
