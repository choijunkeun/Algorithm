package Algorithm_0530;

import java.util.Scanner;

// 거의 근접하게 갔으나 틀림.

public class CodeUp1369 {
    public static void main(String[] args) {
        //별 모양 도형 출력하기에 재미를 붙인 철수는 이번에는 조금 어려운 빗금 친 사각형을 만들어 보기로 했다.
        //
        //n∗n 사각형에서 k간격 마다 빗금을 친 사각형을 출력하는 프로그램을 작성하시오.
        //
        //예를 들어, n=10, k=3이면,
        //
        //**********
        //**  *  * *
        //*  *  *  *
        //* *  *  **
        //**  *  * *
        //*  *  *  *
        //* *  *  **
        //**  *  * *
        //*  *  *  *
        //**********
        //윗변을 기준으로 왼쪽에서 부터 k간격마다 ↙방향으로 빗금을 그으시오.
        //
        //10 3인경우,
        //
        //**********
        //  |  |  |
        // 이 위치들(즉, 3의 배수)

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // n*n 사각형
        int k = scanner.nextInt();  // k간격마다 빗금을 친다.

        //**********
        //**  *  * *
        //*  *  *  *
        //* *  *  **
        //**  *  * *
        //*  *  *  *
        //* *  *  **
        //**  *  * *
        //*  *  *  *
        //**********



        //하드코딩으로 일단 문제접근해보자..

        int cnt = 2;
        for (int a = 0; a < n - 2; a++) {
            // 첫번째줄
            if(a==0) {
                for(int b=0; b<n; b++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // 두번쨰줄 ~ 마지막 전 줄
            for (int i = 0; i < n; i++) {
                // 첫번째칸이나 마지막칸 일떄는 *찍기
                if (i == 0 || i == n - 1) {
                    System.out.print("*");
                    // 두번째칸 ~ 마지막칸-1까지는 k마다 별찍기
                } else {
                    if (((i  + (cnt)) % k == 0)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            cnt++;
            System.out.println();

            // 마지막 줄
            if(a==n-3) {
                for(int c=0; c<n; c++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
