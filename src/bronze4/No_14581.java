package bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_14581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        sb.append(":fan:").append(":fan:").append(":fan:").append("\n")
                .append(":fan::").append(br.readLine()).append("::fan:").append("\n")
                .append(":fan:").append(":fan:").append(":fan:");

        System.out.print(sb);
    }
}
