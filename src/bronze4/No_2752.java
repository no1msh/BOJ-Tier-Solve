package bronze4;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class No_2752 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputString = br.readLine().split(" ");

        int a = Integer.parseInt(inputString[0]);
        int b = Integer.parseInt(inputString[1]);
        int c = Integer.parseInt(inputString[2]);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(a);
        arrayList.add(b);
        arrayList.add(c);

        arrayList.sort(Comparator.naturalOrder());

        for (Integer value : arrayList) {
            System.out.print(value + " ");
        }
    }
}
