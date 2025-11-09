// package Week_6.MadScientist;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MrMarshallInspiredSolution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("breedflip.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("breedflip.out")));

        int n = Integer.parseInt(br.readLine());
        char[] need = br.readLine().toCharArray();
        char[] sent = br.readLine().toCharArray();

        pw.println(countFlips(need, sent, n));
        pw.close();
    }

    public static int countFlips(char[] need, char[] sent, int n) {
        int i = 0, swaps = 0;
        while (i < n) {
            while (i < n && need[i] == sent[i]) i++;
            if (i == n) break;
            swaps++;
            while (i < n && need[i] != sent[i]) i++;
        }
        return swaps;
    }
}
