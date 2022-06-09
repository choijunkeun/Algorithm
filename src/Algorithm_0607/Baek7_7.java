package Algorithm_0607;

import java.util.Scanner;


// 틀림
public class Baek7_7 {
    public static void main(String[] args) {
        //상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다.
        //설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
        //상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다.
        // 예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.
        //상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int cnt = 0;

        while(true) {
            // 5kg봉지로만 담을 때 딱 떨어질 경우
            if(n%5==0) {
                cnt = n/5;
                break;
            }
            // 5kg봉지로 최대한 담고서 마지막 한봉지를 3kg에 담을 수 있을경우
            if((n%5)%3==0) {
                cnt += n/5;
                cnt += cnt/3;
                break;
            }
            // 3kg봉지로만 담을 때 딱 떨어질 경우(5kg으로 다 담을 수 있거나, 5kg으로 최대한 담고 남는설탕을 3kg으로 담을 수 있는것은 위에서 걸러진다)
            if(n%3==0) {
                cnt = n/3;
                break;
            }
            // 3kg으로 먼저 담고 중간에 5kg으로 해결 가능 할 때 의 경우 or 5kg으로 먼저 담고 중간에 3kg으로 해결 가능 할 경우
            if(n%5==1 || n%5==3) {
                cnt = (n/5)+1;
                break;
            } else {
                cnt = -1;
                break;
            }
        }
        System.out.println(cnt);
    }
}
