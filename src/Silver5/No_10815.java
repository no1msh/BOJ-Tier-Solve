package Silver5;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_10815 {
    static int totalCards, totalCheckCards;
    static int[] cards;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        totalCards = Integer.parseInt(br.readLine());
        cards = new int[totalCards];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < totalCards; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cards);

        totalCheckCards = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < totalCheckCards; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (binarySearch(num)) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);

    }

    private static boolean binarySearch(int num) {
        int leftIndex = 0;
        int rightIndex = totalCards - 1;

        while (leftIndex <= rightIndex) {
            int midIndex = (leftIndex + rightIndex) / 2;
            int mid = cards[midIndex];

            if (num < mid) {
                rightIndex = midIndex - 1;
            } else if (num > mid) {
                leftIndex = midIndex + 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
