package Algorithm_0603;

import java.util.Scanner;

// 입력 된 값 n, m 의 곱한 값부터 해서 한개씩 줄이면서 출력.
public class CodeUp1464 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] dimNumArr= new int[n][m];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                // i가 1 이상 일 때 (두번째 줄 부터) n*m-m 부터 1씩 감소하면서 출력 해야 하고. 줄이 바뀔 떄마다 m*i만큼 빼줘야한다.
                if(i>0) {
                    dimNumArr[i][j] = (n*m)-j-(m*i);
                } else {
                    dimNumArr[i][j] = (n*m)-j;
                }
                System.out.print(dimNumArr[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
