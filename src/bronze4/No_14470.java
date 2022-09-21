package bronze4;

import java.io.*;

public class No_14470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int meatTemp = Integer.parseInt(br.readLine());
        int goalTemp = Integer.parseInt(br.readLine());
        int frozenMeltTime = Integer.parseInt(br.readLine());
        int meltTime = Integer.parseInt(br.readLine());
        int heatTime = Integer.parseInt(br.readLine());

        if (meatTemp < 0) {
            System.out.println(Math.abs(meatTemp) * frozenMeltTime + meltTime + goalTemp * heatTime);
        } else {
            System.out.println((goalTemp - meatTemp) * heatTime);
        }
    }
}
