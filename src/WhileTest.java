import java.util.Scanner;
/*
    While 은 말 그대로
     ~을 하는 한을 그대로 보여주는 구문이다.

    --- while 을 사용하는 방법 ---
    1. 일단 반복이 필요한 부분에 while() 을 찍는다.
    2. 조건을 괄호 안에 적는다.
    3. block 안에 조건이 만족된 경우 동작할 반복 패턴을 작성한다.
 */
        /*
        전위 연산자와 후위 연산자
        전위 연산자의 경우 먼저 계산을 하게 된다.
        (그 어떤 무엇보다도 계산이 먼저 진행됨)
        후위 연산자의 경우 계산은 나중에 적용된다.
        나중이란 의미는 다음 줄을 진행하기 전에 진행된다.
         */
public class WhileTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("몇 번 반복할까요 ?");
        int num = in.nextInt();


    /*    while(--num > 0){
            System.out.println("바안보옥");
        }
        */

        /*
        문제. while 문을 사용해서
        1 ~ 100 까지 숫자중 3 의 배수를 추출하시오.
        (for 문 사용 금지)

        숙제 4. 아래와 같은 수열이 존재한다.
        1 1 3 4 5 8 12 17 23
        키보드 입력을 받아 몇 번째 항 까지 합치기를 수행할지 정한다.
        합치기 결과를 출력하시오.
         */
        int i = 1;
        while(i++<=100){
            if(i%3 == 0)
            System.out.println(i);
        }

        int first = 1, third = 3;
        int tmp = 0;

        while(tmp >= num){
            tmp = first; // 1  4  8
            first+=third; // 4 8  16
            third = first; //4 8 4


        }
    }
}
