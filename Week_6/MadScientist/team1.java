package Week_6.MadScientist;

import java.io.*;
import java.util.StringTokenizer;

public class team1 {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

        int N = Integer.parseInt(r.readLine());
        String finish = r.readLine();
        String start = r.readLine();
        int res = 0;
        boolean inGroup = false;   
        // if they are different, true. When we enounter same, false. Every time it becomes false, res +=1;
        if(finish.charAt(0) == start.charAt(0)) {
            inGroup = false;
        } else {
            inGroup = true;
        }
        
        for (int i = 1; i < N; i++) {
            if(finish.charAt(i) == start.charAt(i) && inGroup) {
                res++;
                inGroup = false;
            } 
            
            if(finish.charAt(i) != start.charAt(i) && !inGroup) {
                inGroup = true;
            }
        }
        
        if(inGroup) {
            res++;
        }
        pw.println(res);
		pw.close();
	}
}