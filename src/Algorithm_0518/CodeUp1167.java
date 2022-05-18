package Algorithm_0518;


import java.util.Scanner;
// 난이도 5
public class CodeUp1167 {
    public static void main(String[] args) {
        //문제설명
        //세 개의 숫자가 주어질 때 작은 순서로 나열 했을 때, 두번째 수를 출력해보자.
        //예를 들어, 5 9 2 가 있다면, 작은 순서로 나열하면 2 5 9이고 두번째 수는 5이다.
        //입력 예시 201 20 3   출력 예시 20
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        //총 2번 반복하여 내림차순으로 정렬해준다.
        // ex) 5,3,1 - 순차적으로 나왔을 때는 한번도 이프문을 타지 않아 3이 출력
        // ex) 5,1,3 - 두번째 이프문에서 자리바꿈 일어나서 5,3,1이 됨.
        // ex) 3,1,5 - 두번째 이프문에서 자리바꿈 일어나서 5,3,1이 됨.
        // ex) 3,5,1 - 첫번째 이프문에서 자리바꿈 일어나서 5,3,1이 됨.
        // ex) 1,3,5 - 첫번째 이프문에서 자리바꿈 일어나서 3,1,5가 되고 두번째 이프문에서 3,5,1이 됨. 하지만 아직 정렬이 다 되어있지 않기떄문에 반복문 2번 필요. 두번째에서 첫번째 이프문에서 5,3,1이 됨.
        // ex) 1,5,3 - 첫번째 이프문에서 자리바꿈 일어나서 5,1,3이 되고 두번째 이프문에서 5,3,1이 됨.
        for(int i=0; i<2; i++) {
            // a<b 일 경우 a와 b를 자리바꿈해준다.
            if(a<b) {
                int tmp = a;
                a = b;
                b = tmp;
            }
            // b<c 일 경우 c와 b를 자리바꿈해준다.
            if(b<c) {
                int tmp = b;
                b = c;
                c = tmp;
            }
        }
        System.out.println(b);
    }
}
