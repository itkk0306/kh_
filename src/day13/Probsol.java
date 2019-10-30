package day13;

import java.util.Random;

public class Probsol {
    public static void main(String[] args) {
        final int MAXLEN = 10;
        final int MAXIDX = 6;
        final  int START = 4096;

        int stor[][] = null;
        int idxCnt[] = {0, 0, 0, 0, 0, 0};

        /* 의도: 일일히 다 배치를 하면 작업이 복잡해지니까
            4096 8192 16384 32768 65536 131072
            [0]  [1]   [2]   [3]  [4]   [5]
            300은 0에 5000은 1에 100000는 5에 ...
         */
        stor = new int[MAXIDX][MAXLEN];

        int freeIdxCnt[] = {0, 0, 0, 0, 0, 0};
        int freeArea[][] = new int[MAXIDX][MAXLEN];
        int freeMem[] = new int[10];

        int remain;
        int res;
        Random rand = new Random();

        /* 현재까지의 구현은 공간 할당과 낭비된 공간을 표현한다.
           이 상태에서 추가적으로 처리해야하는 문제는 예로 아래와 같다.
           70000 이 입력된 걍우 131072 를 할당한다.
           남은 공간은 51072 가 될 것이다.
           이 경우 32786, 16384 를 추가로 분해하여 사용할 수 있다.
           어떻게 표현할 것인가?

           낭비되고 있는 남은 공간은 freeMem 이 표현하고 있다.

           1. freeMem &~ (4096 ... 65536) 을 통해서 분해가 가능한지 여부를 판별해야 한다.
           1-1. 가능하면 계속 작업, 1-2. 불가능 하면 작업 중단
           2. 3 번 작업을 위해 freeIdxCnt[5]도 필요하다.
           3. freeArea[2의 승수 인덱스][해당 인덱스의 몇 번째]를 저장
           4. freeMem &~ 32786 ==> res = 32786
              freeMem - res = remain(나머지) = 51072 - 32768 ~ 18000정도
              remain &~ 16384 ===> res = 16384
              freeMem - res = remain(나머지) = ~18000 - 16384 ~ 1000
              if(remain < 4096) 의 조건을 가지고 작업한다.
           5. 4번을 보면 freeMem 을 쓰다가 remain 을 쓰고 있다.
              하나로 통일 시켜야 for 문을 활용할 수 있을텐데 이 부분을 고려해보도록 한다.
           6. 최종적으로 각 파트별(4096 ... 65536) 공간이 몇 개씩 활용이 가능한지 출력하면 된다.
         */
        for(int i = 0; i < MAXLEN; i++){
            // 1 ~ 131072
            int tmp = rand.nextInt(131072) + 1;
            //디버깅을 위해 템프값에 대한 것도 출력
            System.out.println("tmp = " + tmp);
            for(int j = 0; j < MAXIDX; j++){
                if(tmp < START << j){
                    //비트를 밀면서 연산해야한다
                    // 인덱스 배열 때문에 i 를 idxCnt[j] 로 변경
                    stor[j][idxCnt[j]] = tmp;
                    System.out.printf("stor[%d][%d] = %d\n", j, i, stor[j][ idxCnt[j]]);
                    freeMem[i] = (START << j) - tmp;
                    System.out.printf("freeMem[%d] = %d\n", i, freeMem[i]);

                    System.out.println();
                    idxCnt[j]++;
                    break;

                }
            }
            for(int j = 4; j >=0; j--){
                remain = freeMem[i];
                //remain 은 남아 있는 수치
                if((remain &~ ((START << j)- 1)) >= 4096){
                    freeArea[j][freeIdxCnt[j]] = START << j;
                    freeMem[i] -= START << j;
                }
                System.out.printf("freeMem[%d] = %d\n", i , freeMem[i]);
                System.out.printf("freeArea[%d][%d] = %d\n", j, freeIdxCnt[j], freeArea[j][freeIdxCnt[j]]);

                freeIdxCnt[j]++;
            }
        }


    }
}
