package bronze4;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class No_11948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> science = new ArrayList<>();
        ArrayList<Integer> society = new ArrayList<>();
        int total = 0;

        science.add(Integer.parseInt(br.readLine()));
        science.add(Integer.parseInt(br.readLine()));
        science.add(Integer.parseInt(br.readLine()));
        science.add(Integer.parseInt(br.readLine()));

        society.add(Integer.parseInt(br.readLine()));
        society.add(Integer.parseInt(br.readLine()));

        science.sort(Comparator.reverseOrder());
        society.sort(Comparator.reverseOrder());

        for (int i = 0; i < 3; i++) {
            total += science.get(i);
        }
        total += society.get(0);

        System.out.print(total);
    }
}
