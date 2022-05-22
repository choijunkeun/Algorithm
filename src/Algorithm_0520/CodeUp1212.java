package Algorithm_0520;

import java.util.Scanner;
// 난이도 5
public class CodeUp1212 {
    public static void main(String[] args) {
        //세 개의 직선이 있다.
        //숫자의 의미는 직선의 길이를 말한다.
        //이 직선으로 삼각형을 만들 수 있는지 판단하는 프로그램을 작성하시오.
        //삼각형의 성립 조건)
        //a, b, c 가 변의 길이이고 c가 제일 긴 길이라고 한다면
        //c < a + b 이면 삼각형이 성립됨.
        //삼각형이 가능하면 "yes", 삼각형을 만들 수 없다면 "no"를 출력하시오.


        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // 오름차순으로 정렬해서 저장하기 위해 배열에 값 넣기
        int[] arrList = {a,b,c};


        // 반복 횟수는 (배열길이-1) 해줘야한다. (ex: 배열길이가 3이면 arr[0] 과 arr[1] 을 비교해주고 자리바꿔주고, arr[1]과 arr[2]를 비교해서 자리바꿈)
        for(int i = 0; i < arrList.length-1; i++) {
            // 또한 조건문을 통해 자리바꿈을 할 때 마다 제일 큰 숫자를 맨 뒤에 저장하기 때문에, 이동 된 가장 큰 숫자는 비교할 필요가 없다. 따라서 -i 를 해주어 비교횟수를 줄여준다.
            for(int j = 0; j <arrList.length-i-1; j++) {
                // 앞에 숫자가 뒤에숫자보다 크면 (ex : 5,3) , 오름차순으로 만들어줘야 하기 떄문에 자리바꿈 해준다 (5,3) --> (3,5)
                if(arrList[j] > arrList[j+1]) {
                    int tmp = arrList[j];
                    arrList[j] = arrList[j + 1];
                    arrList[j + 1] = tmp;
                }
            }
        }


        if(arrList[2] < arrList[1] + arrList[0]) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
