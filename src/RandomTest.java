import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        //Scanner 같이 생각해주세요~
        Random rand = new Random();
 /*
        for(int i = 0; i < 15; i++){
           랜덤에는 종류가 여러가지 있습니다.
              대표적인 랜덤은 가우시안(정규) 분포, 이항 분포, 푸아송 분포, 기하 분포
              이 중 자연계를 반영하는 랜덤은 가우시안 분포입니다.
              그리고 특정 사건이 발생할 확률은 푸아송 분포입니다. (CCTV 나 범죄 예측, 고장 예측 등에 활용됨)

              우리가 사용한 랜덤은 균일 랜덤입니다.

              nextInt()에 bound 라는 것은 구간을 의미합니다.
              0 <= random 값 < 11을 뜻합니다 ~
              1 ~ 4096 ===> rand.nextInt(4096) + 1
              0 <- x < 4096     //0포함이면 4096
              1 <= x < 4097     // 0 안 포함이면 4097
               System.out.println("random value = " + rand.nextInt(11));
              }

             */
            int number = 100;
            int size = 4096;
            int result = 0;
            int[] Rarray = new int[number];

            for(int i = 0; i < 100; i++) {
                Rarray[i] = rand.nextInt(size);


                System.out.println("Rarray[" + i + "] = " + Rarray[i]);

                result += Rarray[i];
            }

        System.out.println("용량 " + (size*100)+"에서 남는 공간: " + (4096*100 - result));
            //4096


    }
}
