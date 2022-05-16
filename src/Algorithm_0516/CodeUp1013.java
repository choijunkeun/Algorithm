package Algorithm_0516;

import java.util.Scanner;
// 난이도 1
// 정수(int) 2개를 입력받아 그대로 출력하기

public class CodeUp1013 {
    public static void main(String[] args) {
        //변수 두개 선언
        int a, b;
        //스캐너 클래스의 객체 생성
        Scanner scanner = new Scanner(System.in);
        //스캐너 안에 있는 메서드 nextInt()를 사용해서 int형 값 입력 및 리턴
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.printf("%d %d", a, b);
    }
}
