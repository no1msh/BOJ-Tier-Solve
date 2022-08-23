package bronze4;

import java.io.*;

public class No_5532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int vacation = Integer.parseInt(br.readLine());
        int totalSolvePageKorean = Integer.parseInt(br.readLine());
        int totalSolvePageMath = Integer.parseInt(br.readLine());
        int maxSolveOneDayKorean = Integer.parseInt(br.readLine());
        int maxSolveOneDayMath = Integer.parseInt(br.readLine());
        int needSolveDaysKorean = (int) Math.ceil((double) totalSolvePageKorean / maxSolveOneDayKorean);
        int needSolveDaysMath = (int) Math.ceil((double) totalSolvePageMath / maxSolveOneDayMath);

        System.out.print(vacation - Math.max(needSolveDaysKorean , needSolveDaysMath));
    }
}