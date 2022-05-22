package Algorithm_0520;

import java.util.Scanner;
// 아직 못품
public class CodeUp1226 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] lottoArr = new int[7];
        // 로또 당첨 번호 6개 + 보너스번호 1개 입력
        for(int i=0; i< lottoArr.length; i++) {
            lottoArr[i] = scanner.nextInt();
            System.out.println(lottoArr[i]);
        }

        int[] myLotto = new int[6];
        // 내가 선택한 로또 번호
        for(int i=0; i< myLotto.length; i++) {
            myLotto[i] = scanner.nextInt();
        }

        // 로또번호 일치하는거 몇개인지 저장할 변수
        int cnt = 0;

        for(int i=0; i< lottoArr.length; i++) {
            for(int j=0; j< myLotto.length; i++) {
                if(lottoArr[i] == myLotto[j]) {
                    cnt += 1;
                }
            }
        }




    }
}
