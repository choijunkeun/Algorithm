package Algorithm_0516;

import java.time.LocalTime;
import java.util.Scanner;
// 난이도 6
// 입력되는 시:분:초 에서 분만 출력하기
public class CodeUp1026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        //지정된 문자열 값(jumin)을 갖는 StringBuffer인스턴스를 생성한다.
        StringBuilder sb = new StringBuilder(date);
        //문자열 길이가 7보다 같거나 작을경우 ex)5:23:23 앞에 0을 추가해주어 05:23:23으로 만들어준다. 아니면 DateTimeParseException 에러남
        if(sb.length()<=7) {
            sb.insert(0, "0");
        }
        //문자열 sb를 시간으로 파싱한다.
        LocalTime time = LocalTime.parse(sb);
        //"분"만 뽑아내어 int타입 변수에 저장
        int minute = time.getMinute();
        System.out.println(minute);
    }
}
