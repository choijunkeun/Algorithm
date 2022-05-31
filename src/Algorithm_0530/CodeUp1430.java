package Algorithm_0530;

import java.util.Scanner;

public class CodeUp1430 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 보기의 숫자들
        int [] n = new int[scanner.nextInt()];
        for(int i=0; i<n.length; i++) {
            n[i] = scanner.nextInt();
        }

        // 질문의 숫자들
        int[] m = new int[scanner.nextInt()];
        for(int i=0; i<m.length; i++) {
            m[i] = scanner.nextInt();
        }
        scanner.close();

        int check = 0; // 숫자 있었는지 확인

        // 이중 포문은 시간초과 뜸.. 0(n^2) 말고 O(N) 알고리즘으로 풀어야한다
        for(int i=0; i<m.length; i++) {
            for(int j=0; j<n.length; j++) {
                if(n[j]==m[i]) {
                    check=1;
                }
            }
            System.out.print(check + " ");
            check = 0; // 다시 0으로 초기화
        }

    }
}
