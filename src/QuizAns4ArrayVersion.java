import java.util.Scanner;

public class QuizAns4ArrayVersion {
    public static void main(String[] args) {
        int[] series;

        Scanner in = new Scanner(System.in);
        System.out.println("몇 번째 항까지 합칠까요?");

        //실제 [num] 개수만큼 int 형 배열을 할당(메모리 할당)
        int num = in.nextInt();

        //메모리가 할당되었으므로 실제 데이터를 배치
        series = new int[num];

        series[0] = 1;
        series[1] = 1;
        series[2] = 3;

        /* 1 1 3 5 8 12 17 25 37 ...
           1번째와 3번째를 더해서 4번째가 갱신됨
           2번째와 4번째를 더해서 5번째가 갱신됨
           3번째와 5번째를 더해서 6번째가 갱신됨

           배열의 인덱스는 0부터 시작한다는 것!
           그러므로 1 번째는 [0], 2 번째는 [1] ... 기억하자!
         */
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




    }
}
