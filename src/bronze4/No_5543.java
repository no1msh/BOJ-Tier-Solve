package bronze4;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class No_5543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> burger = new ArrayList<>();

        burger.add(Integer.parseInt(br.readLine()));
        burger.add(Integer.parseInt(br.readLine()));
        burger.add(Integer.parseInt(br.readLine()));
        burger.sort(Comparator.naturalOrder());
        int drinkA = Integer.parseInt(br.readLine());
        int drinkB = Integer.parseInt(br.readLine());

        System.out.print(burger.get(0) + Math.min(drinkA, drinkB) - 50);
    }
}
