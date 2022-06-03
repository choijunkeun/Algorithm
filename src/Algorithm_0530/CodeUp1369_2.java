package Algorithm_0530;

import java.util.Scanner;

// 문제 : n길이의 정사각형 안에서 k(1이상) 만큼 간격을 두어 별을 찍는데 빗금형식으로 찍는 문제.

public class CodeUp1369_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());

        // 1 ~ n까지의 열로 반복한다. (세로 길이)
        for (int i=1;i<=n;i++) {
            // 1 ~ n까지의 행으로 반복한다. (가로 길이)
            for (int j=1;j<=n;j++) {
                // (i==1) -> 첫번째 열이거나,
                // (j==1) -> 첫번째 행이거나,
                // (i==n) -> 마지막 열이거나,
                // (j==n) -> 마지막 행일 때는 * 를 찍는다.
                if(i==1 || i==n || j==1 || j==n) {
                    System.out.print(" * ");

                    // k(간격을 1로 줬을때는 모든 칸에 *가 들어가야 한다.)
                } else if(k == 1) {
                    System.out.print(" * ");

                    //행이 +1될 수록 빗금(*)은 좌측으로 1칸씩 이동
                    //(ex: 세 칸 마다 별을 찍는다는 가정을 하고 두번째 열을 예로 들면 i==2 일테고, j가 1씩 증가하는데,
                    // 2+j%3==1 일 경우 *을 찍는것이다. 따라서 두번째 행은 2+2%3==1 이니 별을 찍고 세번째 행과 네번째 행은 2+3%3==1, 2+4%3==1 이 아니니 별을 찍지 않는다.
                    // 다섯번째 행은 2+5%3==1 이 일치하니 별을 찍는다. 이런식으로 한 행을 찍고 다음행으로 넘어가게 되면 행이 + 1(j가 1씩증가) 하게 되는데, 나머지가 1씩 증가하니, 별이 찍히는 행의 위치도
                    // 좌측으로 한칸씩 이동하게 된다.
                } else if((i+j) % k == 1) {
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
