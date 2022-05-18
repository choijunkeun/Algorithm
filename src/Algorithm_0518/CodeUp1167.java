package Algorithm_0518;


import java.util.Scanner;
// 난이도 5
public class CodeUp1167 {
    public static void main(String[] args) {
        //세 개의 숫자가 주어질 때 작은 순서로 나열 했을 때, 두번째 수를 출력해보자.
        //예를 들어, 5 9 2 가 있다면, 작은 순서로 나열하면 2 5 9이고 두번째 수는 5이다.
        //입력 예시 201 20 3   출력 예시 20
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        for(int i=0; i<2; i++) {
            if(a<b) {
                int tmp = a;
                a = b;
                b = tmp;
            }
            if(b<c) {
                int tmp = b;
                b = c;
                c = tmp;
            }
        }
        System.out.println(b);
    }
}
