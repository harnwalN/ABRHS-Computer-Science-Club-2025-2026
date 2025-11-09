package Week_6.MadScientist;

import java.io.*;
import java.util.StringTokenizer;

public class team3 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader("MadScientist"));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(r.readLine());

        int n = Integer.parseInt(r.readLine());

        //readLine
        char[] a = r.readLine().toCharArray();
        char[] b = r.readLine().toCharArray();

        boolean equal = true;

        int flip = 0;
        boolean inRange = true;
        //Basically, if equal, keep it as in-range.
        //Once the a[i] and b[i] don't match, in range is false, equal

        //N being list length of A
        for(int i =0; i < n; i++){
            if (a[i] == b[i] & (equal!=true)){
                flip++;
            }
        }

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        pw.print("The sum of these three numbers is ");
        pw.println(a + b + c);

        pw.close();
    }
}
