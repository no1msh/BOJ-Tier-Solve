package bronze4;

import java.io.*;

public class No_8723 {
    public static void main(String[] args) throws IOException {
        //바이투스가 직각삼각형이나 정삼각형을 만들 수 없다면 0, 직각삼각형만 만들 수 있다면 1, 정삼각형만 만들 수 있다면 2를 출력합니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputString = br.readLine().split(" ");
        int a = Integer.parseInt(inputString[0]);
        int b = Integer.parseInt(inputString[1]);
        int c = Integer.parseInt(inputString[2]);

        int max = Math.max(c, (Math.max(a, b)));
        int count = 0;

        if (a * a == b * b + c * c) {
            count = 1;
        } else if (b * b == a * a + c * c) {
            count = 1;
        } else if (c * c == a * a + b * b) {
            count = 1;
        }

        if (a == b && b == c) {
            count = 2;
        }

        if (max > a + b) {
            count = 0;
        } else if (max > b + c) {
            count = 0;
        } else if (max > a + c){
            count = 0;
        }

        System.out.print(count);

    }
}
