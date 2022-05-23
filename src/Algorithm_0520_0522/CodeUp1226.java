package Algorithm_0520_0522;

import java.util.Scanner;
// 난이도 5
public class CodeUp1226 {
    public static void main(String[] args) {

        //로또번호 6개 + 보너스번호 1개

        int[] lottoArr = new int[7];
        int[] myLotto = new int[6];
        // 로또번호 일치하는거 몇개인지 저장할 변수
        int cnt = 0;
        boolean bonus = false;

        Scanner scanner = new Scanner(System.in);

        // 로또번호 + 보너스번호 1개
        for(int i=0; i< lottoArr.length; i++) {
            lottoArr[i] = scanner.nextInt();
        }

        // 내가 선택한 로또번호 입력
        for(int i=0; i< myLotto.length; i++) {
            myLotto[i] = scanner.nextInt();
        }
        // 보너스 번호를 제외한 일치하는 로또번호 카운트
        for(int i=0; i< myLotto.length; i++) {
            for (int j = 0; j < myLotto.length; j++) {
                if (myLotto[i] == lottoArr[j]) {
                    cnt += 1;
                }
            }
        }

        // 보너스 번호가 맞았는지 확인
        for(int i=0; i<myLotto.length; i++) {
            if(myLotto[i] == lottoArr[6]) {
                bonus = true;
            }
        }
        if(cnt<=2) {
            System.out.println(0);
        } else if(cnt==3) {
            System.out.println(5);
        } else if(cnt==4) {
            System.out.println(4);
        } else if(cnt==5 && bonus==false) {
            System.out.println(3);
        } else if(cnt==5 && bonus==true) {
            System.out.println(2);
        } else if(cnt==6) {
            System.out.println(1);
        }
    }
}
