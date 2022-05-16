package Algorithm_0516;

import java.util.Scanner;
// 난이도 2
// 실수(float) 1개를 입력받아 저장한 후,
// 저장되어 있는 값을 소수점 셋 째 자리에서 반올림하여
// 소수점 이하 둘 째 자리까지 출력하기
public class CodeUp1015 {
    public static void main(String[] args) {
        //실수타입 변수 선언
        float a;
        //스캐너 객체 생성
        Scanner scanner = new Scanner(System.in);
        //nextFloat()를 이용해서 사용자 입력값을 float형 값 입력 및 리턴
        a = scanner.nextFloat();
        //소수점 이하 셋 째 자리에서 반올림하여 솟점 이하 두 자리까지 출력
        System.out.printf("%.2f", a);
    }
}
