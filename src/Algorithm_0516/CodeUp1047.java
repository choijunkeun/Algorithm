package Algorithm_0516;

import java.util.Scanner;

// 정수 1개를 입력받아 2배 곱해 출력하기, 비트단위쉬프트 연산자를 이용하여 출력
public class CodeUp1047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.printf("%d", a<<1);
    }
}
// ex) 8일경우, 2진수로 00000000 00000000 00000000 00001000 (8)
//     쉬프트연산자 << 를 쓸 경우, 8의 2진수를 왼쪽으로 한칸 이동한다. => ... 00010000 (16)
// ex) 쉬프트연산자 <<2 , 3 , 4 .. 일 경우 계속 2배씩 늘어나다가, int형 변수 32bit(4byte)의 데이터 크기를 넘어서면 오버플로우가 발생한다.
//     또한 계속 넘어가다가 32번째(1사이클을) 돌 경우 제자리로 돌아온다.
