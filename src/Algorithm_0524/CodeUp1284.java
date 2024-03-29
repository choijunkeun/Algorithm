package Algorithm_0524;

import java.util.Scanner;

// 틀림 (나중에 다시 풀어보기)
public class CodeUp1284 {
    public static void main(String[] args) {
        //두 소수의 곱을 암호로 사용하는 알고리즘은 큰 수의 소인수분해가 어렵기 때문에 안전하다고 알려져있다.
        //그렇지만, 만약 두 소수를 잊어버리면 어떻게 될까? 굉장히 난감할 것이다.
        //이에 대비해 어떤 수(n)가 입력되면 두 소수의 곱으로 나타낼 수 있으면 두 소수를 오름차순으로 출력하고,
        //그렇지 않으면 "wrong number"를 출력하는 프로그램을 작성하시오.

        // 입력 : 어떤 수 n이 입력된다.(단, 1<=n<=10,000,000)
        // 출력 : n을 두 소수의 곱으로 나타낼 수 있으면 두 수를 오름차순으로 출력한다.
        //(단, 가능한 소수 중 가장 작은 소수와의 곱으로 나타낸다.) 하고, 그렇지 않으면 "wrong number"를 출력한다.

        // 입력 예시 : 21 , 출력 예시 3  7

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 입력값

        for(int i=2; i<=n; i++) {       // 1은 소수가 아니기 때문에 2부터 시작한다.
            int cnt = 0;
            while(n%i==0) {
                n = n / i;

                System.out.print(i + " ");
            }
        }
    }
}
