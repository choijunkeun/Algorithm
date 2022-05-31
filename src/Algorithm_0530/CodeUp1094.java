package Algorithm_0530;

import java.util.Scanner;
// 난이도 1
public class CodeUp1094 {
    public static void main(String[] args) {
        //정보 선생님은 수업을 시작하기 전에 이상한 출석을 부른다.
        //학생들의 얼굴과 이름을 빨리 익히기 위해 번호를 무작위(랜덤)으로 부르는데,
        //영일이는 선생님이 부른 번호들을 기억하고 있다가 거꾸로 불러보는 것을 해보고 싶어졌다.
        //출석 번호를 n번 무작위로 불렀을 때, 부른 번호를 거꾸로 출력해 보자.
        //참고
        //배열에 순서대로 기록해 두고, 기록된 내용을 거꾸로 출력하면 된다.

        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();  // 학생 수 (배열 길이)
        int[] n = new int[cnt];

        // 학생 번호 입력 받기
        for(int i=0;i<n.length; i++) {
            n[i] = scanner.nextInt();
        }

        // 학생 번호 역 출력
        for(int j=(n.length)-1; j>=0; j--) {
            System.out.print(n[j]+" ");
        }

        scanner.close();
    }
}
