import java.util.Scanner;

public class SeqSearch {

    static int seqSearchMethod(int[] a, int n, int key) {
        int i = 0;


        while(true) {
            if(i == n) {
                return -1;
            }
            if(a[i] == key){
                return i;
            }
            i++;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("배열 수");
        int number = scanner.nextInt(); // 배열길이

        int[] arr = new int[number];    // 배열 실제 주소

        for(int i=0; i<arr.length; i++) {
            System.out.print("arr[" + i + "] : ");
            arr[i] = scanner.nextInt();

            System.out.println();
        }

        // 검색

        System.out.println("검색할 값은 ??");
        int key = scanner.nextInt();

        int searchIdx = seqSearchMethod(arr, number, key);

        System.out.println("검색한 값은 현재 " + searchIdx + " 안에 들어가있습니다.");


    }
}
