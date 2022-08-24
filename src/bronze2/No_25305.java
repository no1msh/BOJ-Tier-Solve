package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class No_25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputStr = br.readLine().split(" ");
        int total = Integer.parseInt(inputStr[0]);
        int cutLine = Integer.parseInt(inputStr[1]);
        String[] inputScores = br.readLine().split(" ");

        ArrayList<Integer> scores = new ArrayList<>();

        for (String value : inputScores) {
            scores.add(Integer.parseInt(value));
        }

        scores.sort(Comparator.reverseOrder());

        System.out.print(scores.get(cutLine - 1));


    }
}
