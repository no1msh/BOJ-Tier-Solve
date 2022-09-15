package bronze4;

import java.io.*;

public class No_8718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputStr = br.readLine().split(" ");

        int totalSnow = Integer.parseInt(inputStr[0]) * 1000;
        int snowBall1 = Integer.parseInt(inputStr[1]) * 1000;

        // 1 : 2 : 4 의 비율로 눈사람이 만들어져야하고 하나는 이미 있으며 그것이 비율 1일지 2일지 4일지
        if (snowBall1 * 7 <= totalSnow) {
            System.out.println(snowBall1 * 7);
        } else if (snowBall1 / 2 + snowBall1 + snowBall1 * 2 <= totalSnow) {
            System.out.println(snowBall1 / 2 + snowBall1 + snowBall1 * 2);
        } else if (snowBall1 + snowBall1 / 2 + snowBall1 / 4 <= totalSnow) {
            System.out.println(snowBall1 + snowBall1 / 2 + snowBall1 / 4);
        } else {
            System.out.println(0);
        }
    }
}