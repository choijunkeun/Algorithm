package Algorithm_0604;

import java.util.Scanner;

public class CodeUp1493 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] intArr = new int[n][m];

        // 입력
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                intArr[i][j] = scanner.nextInt();
                if(i!=0 && j!=0) {
                    intArr[i][j] = intArr[i][j - 1] + intArr[i][j];
                }
            }
        }
        // 입력 된 값 변경
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {

            }

        }
    }
}
