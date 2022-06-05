package Algorithm_0603;

import java.util.Scanner;


// 아직 못품..

// 입력 된 값 n, m 의 곱한 값부터 해서 한개씩 줄이면서 출력.  단 지그재그 (ㄹ) 형태로 감소하며 출력
public class CodeUp1472 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] dimNumArr= new int[n][m];

        for(int i=0; i<n; i++) {
            int cnt = m-1;
            for(int j=0; j<m; j++) {
                // 열 개수가 홀수 면 홀수번째 열 이 내림차순이어야 하고, 짝수번째 열이 오름차순이어야 한다.
                if(i%2!=0 || n%2!=0 && i==0 ) {
                    dimNumArr[i][j] = (n*m)-j-(m*i);
                } else {
                    dimNumArr[i][j] = (n*m)-j-cnt;
                    cnt--;
                }
                System.out.print(dimNumArr[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
