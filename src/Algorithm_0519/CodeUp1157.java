package Algorithm_0519;

import java.util.Scanner;

// 난이도 1
public class CodeUp1157 {
    public static void main(String[] args) {
        // 슬기는 체육 선생님과 공던지기로 아이스크림 내기를 하게 됐다.
        //공을 던져서 50m ~ 60m 사이에 공이 들어가면 슬기가 이기게 되고, 그 외에 공이 떨어지면 체육선생님이 이기게 룰을 정했다.
        //슬기가 던진 공의 위치가 입력으로 주어지면 50이상 60이하이면 "win"을 출력하고, 그 외에는 "lose"를 출력하시오.

        float a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextFloat();

        if(a>=50 && a<=60) {
            System.out.println("win");
        } else {
            System.out.println("lose");
        }
    }
}
