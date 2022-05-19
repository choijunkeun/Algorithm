package Algorithm_0519;

import java.util.Scanner;

// 난이도 3
public class CodeUp1171 {
    public static void main(String[] args) {
        //학번을 입력 받아 다음 형식으로 출력하시오.
        //학번은 학년, 반, 번호로 입력된다.
        //이번에는 학년은 한자리, 반은 두자리, 번호는 세자리로 출력한다.
        //예)
        //2 1 20  ===> 201020  으로 출력
        //2 2 7 ==> 202007 으로 출력
        //2 3 100 ==>  203100 으로 출력
        //2 10 111 ==> 210111 로 출력

        int grade, cls, num;
        Scanner scanner = new Scanner(System.in);
        grade = scanner.nextInt();
        cls = scanner.nextInt();
        num = scanner.nextInt();

        if(cls>0 && cls<10) {
            if(num>0 && num<10) {
                String total = grade + "0" + cls + "00" + num;
                System.out.println(total);
            } else if(num>=10 && num<100) {
                String total = grade + "0" + cls + "0" + num;
                System.out.println(total);
            } else {
                String total = grade + "0" + cls + "" + num;
                System.out.println(total);
            }
        } else {
            if(num>0 && num<10) {
                String total = grade + "" + cls + "00" + num;
                System.out.println(total);
            } else if(num>=10 && num<100) {
                String total = grade + "" + cls + "0" + num;
                System.out.println(total);
            } else {
                String total = grade + "" + cls + "" + num;
                System.out.println(total);
            }
        }
    }
}
