package Week_6.MadScientist;

import java.io.*;
import java.util.StringTokenizer;

public class team2 {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		StringTokenizer st = new StringTokenizer(r.readLine());
		int N = Integer.parseInt(st.nextToken());
        String A = r.readLine();
        String B = r.readLine();

        // code starts here
        boolean b = true;
        int flip = 0;
        for(int i=0;i<N;i++){
            if(A.charAt(i)==B.charAt(i)){
                if(b == false){
                    flip++;
            }
            b = true;
            }
            else{
                b = false;
            }
        }
        
        pw.print(flip);
		pw.close();
	}
}