package Algorithm_0524;


// 난이도 7(맞음)
import java.util.Scanner;

//근제는 대기업 CSH의 회장이다.
//최근 기업의 이미지가 좋지 않아 근제는 가난한 사람들에게 기부를 하려고 한다.
//그런데 근제는 특이한 방법으로 기부를 했는데, 기부할 사람들을 번호 순으로 일정한 규칙에 따라 돈을 준다고 한다.
//규칙은 다음과 같다
//1, 10, 2, 20, 3, 30, 4, 40, 5, 50, 6, 60, 7, 70, 8, 80, 9, 90, 10, 100, 11, 110, 12, 120, ...
//한편, 가난한 존과 밥은 돈을 받기 위해 신청을 했다.
//존의 번호(k), 밥의 번호(h)가 주어질때 존과 밥이 받는 기부금의 합을 구하시오.
public class CodeUp1272 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int h = scanner.nextInt();

        int a = choice(k);
        int b = choice(h);
        System.out.println(a+b);

        scanner.close();
    }

    //  (1) , (2)x5, (3)-1, (4)x5, (5)-2, (6)x5, (7)-3, (8)x5, (9)-4, (10)x5, (11)-5, (12)x5
    //  1, 2, 3, 4, 5, 6, 7, 8 .. 이지만 짝수에서는 x5씩 해주고 홀 수 일때는 홀수번째 마다 0부터 시작해서 1씩 증가한 값을 빼준다.

    static int choice(int x) {
        int cnt = 0;
        //x가 짝수면
        if (x % 2 == 0) {
            // 2번째 10, 4번째 20, 6번째 30, 8번째 40, 10번째 50...
            return x*5;

        } else {
            // 1번째 1, 3번째 2,
            return (x + 1) / 2;
        }
    }
}
