package Algorithm_0603;

import java.util.Scanner;


// 아직 다 못품..
public class CodeUp1099 {
    public static void main(String[] args) {
        //미로 상자의 구조가 0(갈 수 있는 곳), 1(벽 또는 장애물)로 주어지고,
        //먹이가 2로 주어질 때, 성실한 개미의 이동 경로를 예상해보자.
        //단, 맨 아래의 가장 오른쪽에 도착한 경우, 더 이상 움직일 수 없는 경우, 먹이를 찾은 경우에는
        //더이상 이동하지 않고 그 곳에 머무른다고 가정한다.
        //미로 상자의 테두리는 모두 벽으로 되어 있으며,
        //개미집은 반드시 (2, 2)에 존재하기 때문에 개미는 (2, 2)에서 출발한다.

        Scanner scanner = new Scanner(System.in);
        int[][] miro = new int[10][10];

        for(int i=0; i<miro.length; i++) {
            for(int j=0; j< miro.length; j++) {
                miro[i][j] = scanner.nextInt();
            }
        }

        for(int i=0; i<miro.length; i++) {
            for(int j=0; j< miro.length; j++) {
                // 첫번째 행은 개미굴의 벽이라 아무것도 안하고 넘어간다.
                if(miro[i][0] == 1) {
                    // 그 후에 1을 만나면 개미가 벽을 만난것이기 떄문에 다음 열로 이동
                } else if(miro[i][j] == 1) {
                    continue;
                }
                // miro[i][i] 가 0 이면 먹이를 찾으러 가는 길이기 떄문에 9 로 바꾼다.
                if(miro[i][j] == 0) {
                    miro[i][j] = 9;
                }

                if(miro[i][j] == 2) {

                }
                System.out.print(miro[i][j]+" ");
            }
            System.out.println();
        }
     }
}
