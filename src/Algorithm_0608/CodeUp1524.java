package Algorithm_0608;

import java.util.Scanner;

public class CodeUp1524 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] boomArr = new int[9][9];

        // 지뢰찾기 맵 입력받기
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                boomArr[i][j] = scanner.nextInt();
            }
        }

        int r = scanner.nextInt() - 1;  // 클릭할 행
        int c = scanner.nextInt() - 1;  // 클릭할 열

        int cnt = 0;

        if (boomArr[r][c] == 1) {
            cnt = -1;
        } else {
            // -1, -1
            if (boomArr[r - 1][c - 1] == 1) {
                cnt += 1;
            } // -1, 0
            if (boomArr[r - 1][c] == 1) {
                cnt += 1;
            } // -1, +1
            if (boomArr[r - 1][c + 1] == 1) {
                cnt += 1;
            } // 0, -1
            if (boomArr[r][c - 1] == 1) {
                cnt += 1;
            } // 0, +1
            if (boomArr[r][c + 1] == 1) {
                cnt += 1;
            } // +1, -1
            if (boomArr[r + 1][c - 1] == 1) {
                cnt += 1;
            } // +1, 0
            if (boomArr[r + 1][c] == 1) {
                cnt += 1;
            } // +1, +1
            if (boomArr[r + 1][c + 1] == 1) {
                cnt += 1;

            }
        }

        System.out.println(cnt);


    }
}
