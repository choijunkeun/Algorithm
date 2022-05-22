package Algorithm_0520;

import java.util.Scanner;

// 난이도 5
public class CodeUp1218 {
    public static void main(String[] args) {
        //조건에 따라 삼각형을 출력한다.
        //조건)
        //세 변의 길이가 같은 경우 : 정삼각형
        //두 변의 길이가 같은 경우 : 이등변삼각형
        //a2 + b2 = c2일 경우(피타고라스 정리) : 직각삼각형
        //위의 조건에 맞지 않는 일반 삼각형일 경우 : 삼각형
        //삼각형이 아닐 경우 : 삼각형아님을 출력한다.

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // 배열 선언해서
        int[] arrList = {a,b,c};

        //오름차순으로 정렬한다.
        for(int i = 0; i < arrList.length-1; i++) {
            for(int j = 0; j <arrList.length-i-1; j++) {
                if(arrList[j] > arrList[j+1]) {
                    int tmp = arrList[j];
                    arrList[j] = arrList[j + 1];
                    arrList[j + 1] = tmp;
                }
            }
        }

        a = arrList[0];
        b = arrList[1];
        c = arrList[2];

        // 정삼각형은 세변의 길이가 같다 (a=b=c)
        if (a==b && b==c) {
            System.out.println("정삼각형");
        // 제일 긴 변의 길이가 나머지 두개의 변의 길이보다 작을 때에 삼각형 조건이 성립된다. a=b=c는 무조건 삼각형이지만 다른조건은 삼각형이 아닐 수도 있기 떄문에 미리 걸러준다.
        } else if(c>=a+b){
            System.out.println("삼각형아님");
        // 두변의 길이가 같은 경우에 이등변삼각형이기 때문에 하나라도 일치하면 true.  혹시나 세 변의 길이가 같은것은 맨 처음 if문에서 걸러준다.
        } else if(a==b || b==c || a==c) {
            System.out.println("이등변삼각형");
        // 직각삼각형일 경우 (a제곱 + b제곱 = c제곱)
        } else if((a*a)+(b*b)==(c*c)) {
            System.out.println("직각삼각형");
        // 위의 공식에 맞지 않는 일반 삼각형일 경우
        } else if(c<a+b) {
            System.out.println("삼각형");
        }
    }
}
