package Algorithm_0524;

import java.util.Scanner;

// 아직 다 못품
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
        int n = scanner.nextInt();

        // 1 -1  1-2  1-3 1-4 1-5 1-6 1-7 1-8 1-9 1-10
        for(int i=2; i<=n/2; i++) {

            for(int j=1; j<=n; j++) {

                if(i*j==n) {
                    System.out.println("i=" +i+ ", j=" +j+ " , 총합 : " + n);
                }
            }
        }


    }
}
