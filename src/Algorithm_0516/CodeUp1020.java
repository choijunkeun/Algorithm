package Algorithm_0516;

import java.util.Scanner;
// 난이도 5
// 주민번호를 입력받아 형태를 바꿔 출력해보자. ex) 000907-1121112 -> 0009071121112
public class CodeUp1020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String jumin = scanner.nextLine();
        //지정된 문자열 값(jumin)을 갖는 StringBuffer인스턴스를 생성한다.
        StringBuffer juminSb = new StringBuffer(jumin);
        //지정된 index에 있는 문자를 제거한다. ex) 101111-1111111 -> 1011111111111
        juminSb.deleteCharAt(6);
        System.out.println(juminSb);
    }
}
