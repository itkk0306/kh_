import java.util.Scanner;

public class QuizAns4ArrayVersion {
    public static void main(String[] args) {
        int[] series;

        Scanner in = new Scanner(System.in);
        System.out.println("몇 번째 항까지 합칠까요?");
        int num = in.nextInt();

        series = new int[num];

        series[0] = 1;
        series[1] = 1;
        series[2] = 3;

        for(int i = 3; i < num; i++){
            series[i] = series[i-3] + series[i-1];
        }

        for(int i = 0; i < num; i++){
            System.out.println("series[" + i+ "] = " + series[i]);
        }

        int res = 0;

        for(int i = 0; i < num; i++){
            res += series[i];
        }

        System.out.println("final res = " + res);
        /*
        숙제 5.
        1 2 4 8 16 32 64 128 256 512 1024 2048 4096 ...
        위 수열의 데이터를 각각 배열에 저장한다 인덱스는 0부터 시작한다.
        8, 10, 12, 16 번째 인덱스의 값들을 추출하여 출력하고 추출한 값들을 모두 더한 값을 출력하시오.
         */



    }
}
