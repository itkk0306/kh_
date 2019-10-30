import java.util.Random;

public class Homework6 {
            /* 숙제 6. [메모리 관리 정책 알고리즘]
            배열 100 개에 무작위 데이터를 할당한다.
            이 무작위 데이터의 범위는 1 ~ 4096 사이로 할당한다. -> 랜덤
            배열 요소 하나가 의미하는 것은 4096 byte 에 해당한다.
            이 때, 낭비된 공간의 크기를 산출하시오. -> 전체는 4096 * 100

           ** 추가적으로 배열 요소 하나의 공간이
            4096, 8192, 16384, 32768, 65536, 2^17 까지 가능하다고 가정한다.
            그리고 무작위 데이터는 1 ~ 2^17 까지 할당할 수 있다.
            이 경우에 이것을 가장 효율적으로 관리하기 위한 프로그램을 작성하시오.
            Hint1. 낭비된 공간이 얼마나 있는지와 각각의 공간을 효율적으로 쓸 수 있도록 한다.)
            Hint2. 비트 연산을 사용하면 효율성이 극대화됨.
            * 편의상 공간의 개수는 10개로 진행하도록 한다.

         */
            public static void main(String[] args) {
                int i;
                int randData[];
                int lostMem = 0;
                //상수 만들 때 final, 숫자값 직접 넣지 않는 게 좋음
                final int ELEMNUM = 100;
                final int MAXMEM = 4096;
                randData = new int[ELEMNUM];
                //스택에 할당
                int storage[] = {4096,8192, 16384, 32768, 65536, 13172 };

                Random rand = new Random();
                for (; ; ) {
                    for (i = 0; i < ELEMNUM; i++) {
                        // 그저 bound: 4096일 때 +1 안 하면 0부터 4095임
                        randData[i] = rand.nextInt(4096) + 1;
                        //sout
                    /*
                    System.out.println("randData[" + i + "] = " + randData[i]);
                    */
                        lostMem += MAXMEM - randData[i];
                    }

                    System.out.println("lostMem = " + lostMem);
                    lostMem = 0;
                }

                /*
                숙제 7-1. -137을 bit 로 표현하시오/
                -137 = -X
                137 = X
                128 + 8 + 1

                0 10001001
                1 01110111(2) = -X = -137
                0 10001001

                숙제 7-2. 10001010 11111010 을 10 진수로 표현하시오
                          0x8 a f a ( 16 진법 방식)

                          16^3 x 8 + 16^2 x 10 + 16 x 15 + 10

                          계산하기가 빡셀때 2진수로 계산 1000 1010 1111 1010
                          2^16 = 65536
                          2^15 = 32768
                          2^11 = 2048
                          2^7 = 128
                          2^3 = 8

                          32768 + 2048 + 128 + 8 ( 2 진법 방식)

                 숙제 7-3. 랜덤 숫자를 입력받아서
                 */
            }
}
