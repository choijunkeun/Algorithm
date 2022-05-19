package Algorithm_0519;

import java.util.Scanner;

// 난이도 2
public class CodeUp1163 {
    public static void main(String[] args) {
        // 태어난 해, 월, 일을 입력받아 사주팔자를 보는 프로그램을 작성하시오.
        //사주를 보는 방법)
        //세 수(년,월,일)가 주어지면,  (년 + 월 + 일)에 100의 자리 숫자가 짝수이면 "대박"을 출력, 그렇지 않으면 "그럭저럭"을 출력하세요.

        // 입력 : 세 정수가 입력으로 주어진다. 순서대로 년도, 월, 일 이다.    출력 : 년도 + 월 + 일의 100의 자리가 숫자가 짝수이면 "대박"을 , 그렇지 않으면 "그럭저럭"을 출력하시오.

        int year,month,day;
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        month = scanner.nextInt();
        day = scanner.nextInt();

        int total = (year + month + day)/100;

        if (total%2==00) {
            System.out.println("대박");
        } else {
            System.out.println("그럭저럭");
        }
    }
}
