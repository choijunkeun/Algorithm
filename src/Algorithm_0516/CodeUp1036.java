package Algorithm_0516;


import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;

// 난이도7
// 영문자 1개를 입력받아 아스키 코드표의 10진수 값으로 출력하기
public class CodeUp1036 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //reader에 담긴 String을 읽고 0번째 index를 char로 변환하여 변수 a에 저장
        char a = reader.readLine().charAt(0);
        int num = a;
        System.out.println(num);
    }
}
