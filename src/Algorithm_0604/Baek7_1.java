package Algorithm_0604;

import java.util.Scanner;

public class Baek7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();  // 고정비용 (노트북 판매 대수에 상관없이 드는 비용)
        long b = scanner.nextInt();  // 가변비용 (노트북 하나당 만드는 비용 (개수*b만큼 추가됨)
        long c = scanner.nextInt();  // 노트북 가격 (노트북을 소비자에게 파는 비용)

        long cnt = 1; // 손익분기점이 얼마만에 발생했는지 저장 할 변수
        long i = 1; // 노트북 판매 개수
        while (true) {
            //가변비용이 노트북가격보다 같거나 크면, 계속 손해이기 때문에 손익분기점이 존재하지 않는다.
            if(b>=c) {
                cnt = -1;
                break;
            }

            // 고정비용 + (가변비용 x 노트북개수) 가 노트북 판매 매출금액보다 많은상태면 손익분기점을 못만난것이다.
            if (a + (b * i) > c * i) {
                cnt++;
            } else {
                cnt++;
                break;
            }
            i++;

        }
        System.out.println(cnt);
    }
}
