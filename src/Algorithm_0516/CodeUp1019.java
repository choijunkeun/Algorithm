package Algorithm_0516;

import java.util.Scanner;
// 난이도 4
// 년, 월, 일을 입력받아 지정된 형식으로 출력하기
public class CodeUp1019 {
    public static void main(String[] args) {
        //스캐너 객체 생성
        Scanner scanner = new Scanner(System.in);
        //문자타입 변수에 저장
        String a = scanner.nextLine();
        //저장된 문자열을 . 기준으로 split(나누어) 배열에 저장. 2013.8.5 -> 2013  8   5
        String[] arr = a.split("\\.");
        //Integer.parseInt를 사용하여 각 배열안의 String값을 int로 바꿔주고 %0x 를 이용해 빈자리에 0을 붙여준다. 그 사이에는 .을 입력해 날짜를 이어준다.
        System.out.printf("%04d.%02d.%02d", Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
    }
}
