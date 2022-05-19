package Algorithm_0519;


import java.util.Scanner;

// 난이도 4
public class CodeUp1168 {
    public static void main(String[] args) {
        //주민등록번호는 생년월일과 성별정보, 지역정보로 이루어진다.
        //여기서 생년월일과 성별정보만 입력으로 받겠다.
        //성별 정보는 1이면 1900년대 출생 남자, 2이면 1900년대 출생 여자, 3이면 2000년대 출생 남자, 4이면 2000년대 출생 여자를 말한다.
        //기준년도는 2012년도이다. 현재 나이를 출력하시오.
        //예)
        //790101 1        =====> 성별정보가 1이므로, 1979년생, 34살이다.
        //080521 4        =====>  성별정보가 4이므로, 2008년생,  5살이다.

        int jumin;
        int gender;
        int year = 2012;

        Scanner scanner = new Scanner(System.in);
        jumin = scanner.nextInt();
        gender = scanner.nextInt();

        jumin = jumin/10000;
        if (gender == 1 || gender == 2) {
            int myYear = 1900+jumin;
            int age = year - myYear + 1;
            System.out.println(age);
        } else if (gender == 3 || gender == 4) {
            int myYear = 2000+jumin;
            int age = year - myYear + 1;
            System.out.println(age);
        }
    }
}


        //현재년도 기준...
//        String jumin;
//        int gender;
//
//        Scanner scanner = new Scanner(System.in);
//        jumin = scanner.nextLine();
//        gender = scanner.nextInt();
//
//        int now = Calendar.getInstance().get(Calendar.YEAR);
//        jumin = jumin.substring(0,2);
//
//        if(gender==1 || gender==2) {
//            int year = Integer.parseInt("19"+jumin);
//            int age = now-year+1;
//            System.out.println(age);
//        } else if(gender==3 || gender==4) {
//            int year = Integer.parseInt("20"+jumin);
//            int age = now-year+1;
//            System.out.println(age);
//        }



