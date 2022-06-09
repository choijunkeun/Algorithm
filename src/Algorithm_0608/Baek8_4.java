package Algorithm_0608;

import java.util.Scanner;

public class Baek8_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();  // 작은 수
        int n = scanner.nextInt();  // 큰 수

        int cnt = 0;

        for(int i=m; m<=n; i++) {
            for(int j=1; j<n; j++) {
                if(i+1%j+1==0) {
                    continue;
                } else {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
