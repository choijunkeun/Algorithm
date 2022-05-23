package Algorithm_0523;

import java.io.*;

// 난이도 2
public class Baek3_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(bf.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<repeat; i++) {
            String a = bf.readLine();
            String[] arr = a.split(" ");
            bw.write(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]) +"\n");
        }
        bw.flush();
    }
}

