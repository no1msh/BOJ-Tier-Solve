package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_20492 {
    public static void main(String[] args) throws IOException {
        //전체 상금의 22%를 제세공과금으로 납부하는 경우
        //상금의 80%를 필요 경비로 인정받고, 나머지 금액 중 22%만을 제세공과금으로 납부하는 경우
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = Integer.parseInt(br.readLine());

        System.out.println((int)(money * 0.78));
        System.out.print((int)(money - (money * 0.2 * 0.22)));

    }
}
