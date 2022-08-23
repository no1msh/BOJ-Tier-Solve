package bronze4;

import java.io.*;

public class No_4299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputScoreString = br.readLine().split(" ");

        int scoreSum = Integer.parseInt(inputScoreString[0]);
        int scoreSub = Integer.parseInt(inputScoreString[1]);

        int teamScore1 = scoreSub;
        int teamScore2 = 0;

        if (scoreSub == 0) {
            System.out.print(scoreSum / 2 + " " + scoreSum / 2);
            return;
        }

        while (true) {

            if (scoreSum == teamScore1 + teamScore2 && scoreSub == teamScore1 - teamScore2) {
                System.out.print(teamScore1 + " " + teamScore2);
                break;
            }
            teamScore1++;
            teamScore2++;

            if (teamScore1 + teamScore2 > scoreSum) {
                System.out.print(-1);
                break;
            }
        }

    }
}
