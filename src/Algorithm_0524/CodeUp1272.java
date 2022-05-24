package Algorithm_0524;


// 난이도 8
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
    }

    //  1 , 2x5, 2, 4x5, 3, 6x5, 4, 8x5, 5, 10x5, 6, 12x5
    //  홀수면 x에서 i+1씩 빼주면 되고 , 짜굿면 x5씩 해주면 된다.
    static int choice(int x) {
        int cnt = 0;
        //x가 짝수면
        if (x % 2 == 0) {
            // 2번째 10, 4번째 20, 6번째 30, 8번째 40, 10번째 50...
            return (x / 2) * 10;
        } else {
            // 1번째 1, 3번째 2,
            return (x + 1) / 2;
        }
    }
}
