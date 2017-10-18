package random;

/* ID: GOWTHAM11
   LANG: JAVA
   TASK: test
 */

import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by Gowtham on 15-02-2017
 */
public class ReadInt {

    public static void main(String... args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("read_int_int.txt"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("read_int_out.txt")));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int i1 = Integer.parseInt(st.nextToken());
        int i2 = Integer.parseInt(st.nextToken());

        pw.println(i1 + i2);
        pw.close();
    }
}
