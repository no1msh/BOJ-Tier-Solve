package bronze4;

import java.io.*;

public class No_25704 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int coupon = Integer.parseInt(br.readLine());
        int price = Integer.parseInt(br.readLine());
        int discount20 = (int) (price * 0.75);
        int discount15 = Math.max(price - 2000, 0);
        int discount10 = (int) (price * 0.9);
        int discount5 = Math.max(price - 500, 0);

        if (coupon >= 20) {
            System.out.print(Math.min(discount20, discount15));
        } else if (coupon >= 15) {
            System.out.print(Math.min(discount15, discount10));
        } else if (coupon >= 10) {
            System.out.print(Math.min(discount10, discount5));
        } else if (coupon >= 5) {
            System.out.print(discount5);
        } else {
            System.out.print(price);
        }
    }
}
