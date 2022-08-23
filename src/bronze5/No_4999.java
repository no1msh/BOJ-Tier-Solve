package bronze5;

import java.io.*;

public class No_4999 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String patient = br.readLine();
        String doctor = br.readLine();

        if (patient.length() >= doctor.length()){
            System.out.print("go");
        } else {
            System.out.print("no");
        }

    }
}
