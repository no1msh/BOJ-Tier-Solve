package bronze4;

import java.io.*;

public class No_2530 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputString = br.readLine().split(" ");

        int hour = Integer.parseInt(inputString[0]);
        int minute = Integer.parseInt(inputString[1]);
        int second = Integer.parseInt(inputString[2]);
        int needSecond = Integer.parseInt(br.readLine());

        if (needSecond < 60) {
            second += needSecond;
            if (second >= 60) {
                minute += 1;
                second -= 60;
                if (minute >= 60) {
                    hour += 1;
                    minute -= 60;
                    if (hour >= 24) {
                        hour = 0;
                    }
                }
            }
        } else {
            minute += (second + needSecond) / 60;
            second = (second + needSecond) % 60;
            if (minute >= 60) {
                hour += minute / 60;
                minute = minute % 60;
                if (hour >= 24) {
                    hour %= 24;
                }
            }
        }

        System.out.print(hour + " " + minute + " " + second);
    }
}