package Week_3;
import java.util.*;
import java.io.*;

// Breed Counting - USACO 2015 December Contest, Bronze Question 3
// https://usaco.org/index.php?page=viewproblem2&cpid=572
public class S2015_D3_BreedCountingSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("bcount.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("bcount.out")));
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        ArrayList<Integer> holsteinPrefix = new ArrayList<>();
        ArrayList<Integer> guernseyPrefix = new ArrayList<>();
        ArrayList<Integer> jerseyPrefix = new ArrayList<>();
        holsteinPrefix.add(0);
        guernseyPrefix.add(0);
        jerseyPrefix.add(0);

        for (int i = 0; i < n; i++) {
            int breed = Integer.parseInt(br.readLine());
            if (breed == 1) {
                holsteinPrefix.add(holsteinPrefix.get(i) + 1);
                guernseyPrefix.add(guernseyPrefix.get(i));
                jerseyPrefix.add(jerseyPrefix.get(i));
            } else if (breed == 2) {
                holsteinPrefix.add(holsteinPrefix.get(i));
                guernseyPrefix.add(guernseyPrefix.get(i) + 1);
                jerseyPrefix.add(jerseyPrefix.get(i));
            } else if (breed == 3) {
                holsteinPrefix.add(holsteinPrefix.get(i));
                guernseyPrefix.add(guernseyPrefix.get(i));
                jerseyPrefix.add(jerseyPrefix.get(i) + 1);
            }
        }

        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int holsteins = holsteinPrefix.get(b) - holsteinPrefix.get(a - 1);
            int guernseys = guernseyPrefix.get(b) - guernseyPrefix.get(a - 1);
            int jerseys = jerseyPrefix.get(b) - jerseyPrefix.get(a - 1);

            pw.println(holsteins + " " + guernseys + " " + jerseys);
        }
        pw.close();
    }
}