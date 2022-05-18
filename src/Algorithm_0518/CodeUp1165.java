package Algorithm_0518;

import java.util.Scanner;

// 난이도 3
public class CodeUp1165 {
    public static void main(String[] args) {
        //문제설명
        //지금 1반과 2반이 축구를 하고있다.
        //축구경기 타임은 총 90분이고,
        //현재 1반이 0점, 2반이 2점인 상황에서, 1반은 경남정보고 최고의 스트라이커인 성익이를 투입하기로 결정했다.
        //성익이는 5분마다 골을 넣을 수 있는 능력을 가지고 있다.
        //만약 80분에 투입이 되면 80분에 곧바로 골을 넣게되고 85분에 골을 넣음으로서 동점이 가능하게 된다.
        //(90분이되면 경기가 바로 종료되므로 골을 넣을 수 없다. 동내심판인 성빈이는 성익이가 잘 되는 것을 싫어하기 때문에 추가시간 따위는 주지 않는다. )
        //현재 경기타임과 우리팀의 득점이 입력으로 주어 질때, 성익이를 투입하면 우리팀의 최종 득점은 몇 점인지 출력하시오.

        //입력 예시 74 2  출력 예시 6
        //도움말 74분에 투입되면 74, 79, 84, 89분에 골을 넣게 된다.
        int time,score;
        Scanner scanner = new Scanner(System.in);
        time = scanner.nextInt();
        score = scanner.nextInt();

        //89까지 반복해서 돈다(경기시간 0부터~89분까지(90분이 되면 경기 종료))
            for(int i=0; i<90; i++) {
                //투입된 시간이 0~89(90분엔 경기가 바로 종료해서 골을 넣을 수 없다)까지일 경우에만 실행된다.
                if(time>=0 && time<90) {
                    score += 1;
                    time += 5;
                }
            }
        System.out.println(score);
        }
    }